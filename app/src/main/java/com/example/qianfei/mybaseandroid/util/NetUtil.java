package com.example.qianfei.mybaseandroid.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by qf on 2018/11/16
 * 描述: NetUtil
 */
public class NetUtil {


//    public static Build Builder() {
//        Build build = new Build();
//        return build;
//    }

    public Retrofit getCall() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.retryOnConnectionFailure(true);
        builder.connectTimeout(60 * 1000, TimeUnit.SECONDS);
        builder.writeTimeout(60 * 1000, TimeUnit.SECONDS);
        builder.readTimeout(60 * 1000, TimeUnit.SECONDS);

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("head1","headvalue");
        hashMap.put("head2","headvalue");
        builder.addInterceptor(new commonInterceptor(hashMap));
        OkHttpClient build = builder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://gjjv2.youyuwo.com/appapi/")
                .client(build)
                .build();
        return retrofit;
    }

    public static class Build {
        private String url;

        public String getUrl() {
            return url;
        }


        public void build() {

        }

        public void setUrl(String url) {
            this.url = url;
        }
    }


    private class commonInterceptor implements Interceptor {


        private Map<String, String> headers;

        public commonInterceptor(Map<String, String> headers) {
            this.headers = headers;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Request.Builder requestBuilder = request.newBuilder();
//            requestBuilder.addHeader("测试head", "测试head");

            if (headers != null && headers.size() > 0) {
                Set<String> keys = headers.keySet();
                for (String headerKey : keys) {
                    requestBuilder.addHeader(headerKey,   headers.get(headerKey)).build();
                }
            }



            RequestBody formBody = new FormBody.Builder()
                    .add("userId", "10000")
                    .add("sessionToken", "E34343RDFDRGRT43RFERGFRE")
                    .add("q_version", "1.1")
                    .add("device_id", "android-344365")
                    .add("device_os", "android")
                    .add("device_osversion","6.0")
                    .add("req_timestamp", System.currentTimeMillis() + "")
                    .add("app_name","forums")
                    .add("sign", "md5")
                    .build();
            String postBodyString = bodyToString(request.body());
            postBodyString += ((postBodyString.length() > 0) ? "&" : "") +  bodyToString(formBody);
            request = requestBuilder
                    .post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded;charset=UTF-8"),
                            postBodyString))
                    .build();
            return chain.proceed(request);
        }
    }

    private static String bodyToString(final RequestBody request){
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if(copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        }
        catch (final IOException e) {
            return "did not work";
        }
    }
}
