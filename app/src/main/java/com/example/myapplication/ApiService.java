package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("5fd2b33281ec296ae71c5fd1")
    Call<JSONResponse> getUser();

}
