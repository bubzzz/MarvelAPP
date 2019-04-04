package com.example.marvelapp;

import com.example.marvelapp.model.HeroRestResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface superheroapi {
    @GET("characters")
    Call<HeroRestResponse> getListHero(@Query("ts") String ts, @Query("apikey") String apikey, @Query("hash") String hash);
}
