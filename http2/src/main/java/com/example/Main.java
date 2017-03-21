package com.example;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("fuck");
        OkHttpClient client = new OkHttpClient.Builder()
                .addNetworkInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        System.out.println("Https " + request.isHttps());
                        Response response = chain.proceed(request);
                        return response;
                    }
                })
                .build();

        Request request = new Request.Builder()
                .header("accept-encoding", "gzip")
                .url("https://www.google.com.hk")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.protocol().toString());
    }
}
