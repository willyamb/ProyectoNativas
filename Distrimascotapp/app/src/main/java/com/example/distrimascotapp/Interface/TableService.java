package com.example.distrimascotapp.Interface;

import com.example.distrimascotapp.models.ResponseWeb;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TableService {
    @GET("tables")
    Call<ResponseWeb> getTables();
}
