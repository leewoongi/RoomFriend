package com.woon.roomfriends.repos;


import com.woon.roomfriends.repos.entity.ResponseDao;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebService {
    @GET("/search/users")
    Call<ResponseDao> retrieveUser(@Query("q") String text);
}
