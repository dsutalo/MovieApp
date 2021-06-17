package com.example.fragmentsearch.Movie;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkUtils {

    private static APIInterface apiInterface;

    public static APIInterface getApiInterface(){
        if(apiInterface == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.themoviedb.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            apiInterface = retrofit.create(APIInterface.class);
        }
        return apiInterface;
    }
}
