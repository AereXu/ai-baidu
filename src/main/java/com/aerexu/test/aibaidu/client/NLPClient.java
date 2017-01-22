package com.aerexu.test.aibaidu.client;

import com.aerexu.test.aibaidu.dto.response.request.WordSegReq;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/17 9:42
 * @version: 1.0.0
 */
public interface NLPClient {
    @POST("rpc/2.0/nlp/v1/wordseg")
    @Headers({
            "Content-Type: application/json; charset=GBK",
            "Content-Encoding: GBK"
    })
    Call<ResponseBody> wordSegment(@Query("access_token") String token, @Body String s);

}
