package com.example.distrimascotapp.Interface;
import com.example.distrimascotapp.models.User;
import com.example.distrimascotapp.models.UserResponse;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {
    @GET("users/")
    Call<List<User>> getUser();

    @POST("users/login")
    Call<UserResponse> loginUser(@Body User user);

    @POST("users/loginemail")
    Call<UserResponse> loginEmail(@Body User user);
}
