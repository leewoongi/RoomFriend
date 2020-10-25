package com.woon.roomfriends.data.datasource;


import com.woon.roomfriends.data.dao.ResponseDao;

import io.reactivex.Maybe;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebService {
    @GET("/search/users")
    Maybe<ResponseDao> retrieveUser(@Query("q") String text);
}
