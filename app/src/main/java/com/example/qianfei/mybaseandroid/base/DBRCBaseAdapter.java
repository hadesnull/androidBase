package com.example.qianfei.mybaseandroid.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by qf on 2018/12/12
 * 描述: DBRCBaseAdapter
 */
public class DBRCBaseAdapter extends RecyclerView.Adapter<DBRCBaseAdapter.BaseViewHolde>{


    public DBRCBaseAdapter(int layoutRes) {

    }

    @Override
    public BaseViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {


        return null;
    }

    @Override
    public void onBindViewHolder(BaseViewHolde holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class BaseViewHolde extends RecyclerView.ViewHolder{

        public BaseViewHolde(View itemView) {
            super(itemView);
        }
    }
}
