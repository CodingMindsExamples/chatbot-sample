package com.example.vmac.WatBot;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yusun on 5/9/18.
 */

public interface WastonService {

    @GET("/talk")
    public Call<ResponseBody> getTalk(@Query("input") String message);

}
