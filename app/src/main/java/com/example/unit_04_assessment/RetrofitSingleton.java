package com.example.unit_04_assessment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {
    private static Retrofit retrofit;

    private RetrofitSingleton () {

    }
    public static Retrofit getInstance () {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://raw.githubusercontent.com/")
                    .build();
        }
        return retrofit;
    }

}
