package com.suncode.loginapi.service;

import com.suncode.loginapi.model.Login;
import com.suncode.loginapi.model.Signup;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BaseService {
    @FormUrlEncoded
    @POST("signin.php")
    public Call<Login> loginUser(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("signup.php")
    public Call<Signup> signupUser(@Field("fullname") String fullname, @Field("email") String email, @Field("password") String password);
}
