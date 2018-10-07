package com.anubhavmalikdeveloper.letsarchitecture.REST;

import com.anubhavmalikdeveloper.letsarchitecture.Models.Post;
import com.anubhavmalikdeveloper.letsarchitecture.Models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("users")
    Call<List<User>> getUserList();

    @GET("posts")
    Call<List<Post>> getPosts();
}
