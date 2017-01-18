package com.aerexu.test.aibaidu.controller;

import com.aerexu.test.aibaidu.client.NLPClient;
import com.aerexu.test.aibaidu.dto.response.CommonError;
import com.aerexu.test.aibaidu.dto.response.TokenError;
import com.aerexu.test.aibaidu.dto.response.TokenRes;
import com.aerexu.test.aibaidu.dto.response.request.WordSegReq;
import com.aerexu.test.aibaidu.dto.response.wordseg.WordSegmentRes;
import com.aerexu.test.aibaidu.token.TokenService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/17 11:28
 * @version: 1.0.0
 */
@Slf4j
@RestController
@RequestMapping(path = "/nlp")
public class NLPController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private NLPClient nlpClient;

    @RequestMapping(path = "/wordseg")
    public WordSegmentRes wordSeg(@RequestParam String text) {
        WordSegmentRes wordSegmentRes = null;
        String accessToken = tokenService.getToken().getAccessToken();
        Call<ResponseBody> call = nlpClient.wordSegment(accessToken,
                new WordSegReq(new String(StringUtils.trimAllWhitespace(text).getBytes(),Charset.forName("GBK"))));
        try {
            Response<ResponseBody> execute = call.execute();
            if (HttpStatus.valueOf(execute.code()).is2xxSuccessful()) {
//                try (InputStreamReader reader = new InputStreamReader(execute.body().byteStream(), Charset.forName("GBK"))) {
                try (Reader reader = execute.body().charStream()) {
                    wordSegmentRes = new Gson().fromJson(reader, WordSegmentRes.class);
                }

            } else if (HttpStatus.valueOf(execute.code()).is4xxClientError()
                    || HttpStatus.valueOf(execute.code()).is5xxServerError()) {
                CommonError commonError = new Gson().fromJson(execute.body().string(), CommonError.class);
                log.warn("Error happens of processing wordseg! {}", commonError);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordSegmentRes;
    }
}
