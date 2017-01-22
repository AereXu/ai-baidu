package com.aerexu.test.aibaidu.client;

import com.aerexu.test.aibaidu.dto.response.request.WordSegReq;
import com.google.gson.Gson;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Call;

import java.nio.charset.Charset;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/19 15:46
 * @version: 1.0.0
 */
@Component
public class NLPClientAdapter {
    @Autowired
    private NLPClient nlpClient;

    public Call<ResponseBody> wordSegment(String token, WordSegReq wordSegReq){
        return nlpClient.wordSegment(token,new String(new Gson().toJson(wordSegReq).getBytes(), Charset.forName("GBK")));
    }
}
