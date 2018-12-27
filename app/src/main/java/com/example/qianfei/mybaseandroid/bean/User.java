package com.example.qianfei.mybaseandroid.bean;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.content.Context;

import java.lang.ref.WeakReference;

/**
 * Created by qf on 2018/11/20
 * 描述: User
 */
@Entity
public class User {

    private static volatile User user;



    private static WeakReference<Context> mContext;

    public static User getInstance(Context context) {
        mContext =  new WeakReference(context);
        synchronized (User.class) {
            if (null == user) {
                synchronized (User.class) {
                    if (null == user) {
                        user = new User();
                    }
                }
            }
            return user;
        }
    }

    @PrimaryKey(autoGenerate = true)//主键是否自动增长，默认为false
    private int id;

    private String name;

    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
