package com.aerexu.test.aibaidu.token;

import com.aerexu.test.aibaidu.client.TokenClient;
import com.aerexu.test.aibaidu.dto.TokenError;
import com.aerexu.test.aibaidu.dto.TokenRes;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/13 17:19
 * @version: 1.0.0
 */
@Slf4j
@Component
public class TokenService {

    @Value("${com.aerexu.aibaidu.clientId}")
    private String clientId;

    @Value("${com.aerexu.aibaidu.clientSecret}")
    private String clientSecret;

    private TokenRes tokenRes;

    @Autowired
    private TokenClient tokenClient;

    public void run() {
        Call<ResponseBody> call = tokenClient.getToken("client_credentials", clientId, clientSecret);
        try {
            Response<ResponseBody> execute = call.execute();
            if (HttpStatus.valueOf(execute.code()).is2xxSuccessful()) {
                tokenRes = new Gson().fromJson(execute.body().string(), TokenRes.class);
            } else if (HttpStatus.valueOf(execute.code()).is4xxClientError()
                    || HttpStatus.valueOf(execute.code()).is5xxServerError()) {
                TokenError tokenError = new Gson().fromJson(execute.body().string(), TokenError.class);
                log.warn("Error happens of getting token! {}", tokenError);
            }
        } catch (IOException e) {
            log.error("Network error!", e);
        }

    }

}
