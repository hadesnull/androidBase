package com.example.qianfei.mybaseandroid.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.qianfei.mybaseandroid.bean.User;

/**
 * Created by qf on 2018/11/20
 * 描述: UserDatabase
 */
@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {

    private static final String DB_NAME = "UserDatabase.db";

    private static UserDatabase database;

    public static UserDatabase getInsttance(Context context) {
        if (database == null) {
            synchronized (UserDatabase.class) {
                if (null == database) {
                    database = creatUserDataBase(context);
                }
            }
        }
        return database;
    }


    static UserDatabase creatUserDataBase(Context context) {
        return Room.databaseBuilder(context, UserDatabase.class, DB_NAME).build();
    }

    public abstract UserDao getUserDao();
}
