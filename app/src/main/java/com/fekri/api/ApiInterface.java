package com.fekri.api;

import com.fekri.model.TvMazeModelItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/shows/1/cast")
    Call<List<TvMazeModelItem>> getHeroList();
}
