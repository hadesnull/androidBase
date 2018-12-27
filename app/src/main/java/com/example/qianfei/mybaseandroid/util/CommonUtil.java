package com.example.qianfei.mybaseandroid.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.qianfei.mybaseandroid.R;

import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;

/**
 * Created by qf on 2018/11/29
 * 描述: CommonUtil
 */
public class CommonUtil {
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public static void setNotify(Context context, Class cla, Service service) {
        NotificationManager manager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent intent = new Intent(context, cla);
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentText("测试内容")
                .setTicker("测试ticker")
                .setOngoing(false)
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.ic_launcher_background);


        /**使用taskStack可以在退出时显示主页面  需要在清单中设置parentActivityName**/
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addParentStack(cla);
        stackBuilder.addNextIntent(intent);
//        PendingIntent activitie = PendingIntent.getActivity(context, 0, intent, FLAG_UPDATE_CURRENT);
        PendingIntent activitie = stackBuilder.getPendingIntent(0, FLAG_UPDATE_CURRENT);
        /****/
        builder.setContentIntent(activitie);

        Notification build = builder.build();
        manager.notify(0, build);
        service.startForeground(0, build);

    }
}
