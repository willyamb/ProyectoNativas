package com.example.distrimascotapp.Interface;

import com.example.distrimascotapp.models.Order;
import com.example.distrimascotapp.models.ResponseWeb;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface OrderService {
    @GET("orders/")
    Call<List<Order>> getOrder();

    @POST("orders/orderclient/")
    Call<ResponseWeb> getOrderClient(@Body Order order);
}
