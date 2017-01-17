package com.aerexu.test.aibaidu.client;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/13 17:25
 * @version: 1.0.0
 */
public interface TokenClient {
    @POST("oauth/2.0/token")
    Call<ResponseBody> getToken(@Query("grant_type") String grantType, @Query("client_id") String clientId, @Query("client_secret") String clientSecret);
}
