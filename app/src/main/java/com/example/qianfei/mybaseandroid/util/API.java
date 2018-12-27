package com.example.qianfei.mybaseandroid.util;

import com.example.qianfei.mybaseandroid.bean.CommBean;
import com.example.qianfei.mybaseandroid.bean.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by qf on 2018/11/16
 * 描述: API
 */
public interface API {
    @Headers("apikey:81bf9da930c7f9825a3c3383f1d8d766")
    @POST("recommend")
    Call<CommBean> getNews(@Query("locationKey") String locationKey);

    @POST("api/users")
    Call<CommBean> uploadNewUser(@Body User user);
}
