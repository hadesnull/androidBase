package com.example.qianfei.mybaseandroid.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qianfei.mybaseandroid.BR;
import com.example.qianfei.mybaseandroid.R;
import com.example.qianfei.mybaseandroid.base.BaseBindActivity;
import com.example.qianfei.mybaseandroid.model.EventActivityVM;

/**
 * Created by qf on 2018/11/30
 * 描述: EventActivity
 */
public class EventActivity extends BaseBindActivity {

    private RecyclerView mRecycle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        EventActivityVM eventActivityVM = ViewModelProviders.of(this).get(EventActivityVM.class);

        ViewDataBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_event);




        viewDataBinding.setVariable(BR.eventVm, eventActivityVM);

        mRecycle = findViewById(R.id.recycle_list);
        mRecycle.setLayoutManager(new LinearLayoutManager(this));
        mRecycle.setAdapter(new MyRcAdapter());

        eventActivityVM.activityNameMu.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(EventActivity.this, s ,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getVmBRid() {
        return BR.eventVm;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("EventActivity", "------------onTouchEvent");
        return super.onTouchEvent(event);
    }

    public class MyRcAdapter extends RecyclerView.Adapter<MyRcAdapter.MyViewHolde>{


        @Override
        public MyViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolde(LayoutInflater.from(EventActivity.this).inflate(R.layout.item_adapter, parent, false));
        }

        @Override
        public void onBindViewHolder(MyViewHolde holder, int position) {
            holder.mItemName.setText(position + "----");
        }

        @Override
        public int getItemCount() {
            return 20;
        }

        class MyViewHolde extends RecyclerView.ViewHolder{

            private View layout;
            public TextView mItemName;

            public MyViewHolde(View itemView) {
                super(itemView);
                this.layout = itemView;
                mItemName = itemView.findViewById(R.id.item_name);

            }
        }
    }
}
