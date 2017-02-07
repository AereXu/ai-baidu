package com.aerexu.test.aibaidu.controller;

import com.aerexu.test.aibaidu.client.NLPClient;
import com.aerexu.test.aibaidu.client.NLPClientAdapter;
import com.aerexu.test.aibaidu.client.WordSegmentClient;
import com.aerexu.test.aibaidu.dto.response.CommonError;
import com.aerexu.test.aibaidu.dto.response.TokenError;
import com.aerexu.test.aibaidu.dto.response.TokenRes;
import com.aerexu.test.aibaidu.dto.response.request.WordSegReq;
import com.aerexu.test.aibaidu.dto.response.wordseg.WordSegmentRes;
import com.aerexu.test.aibaidu.token.TokenService;
import com.aerexu.test.aibaidu.utils.ByteArrayUtil;
import com.baidu.aip.nlp.AipNlp;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ResponseBody;
import org.json.JSONObject;
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
    private WordSegmentClient wordSegmentClient;

    @RequestMapping(path = "/wordseg")
    public WordSegmentRes wordSeg(@RequestParam String text) {
        String accessToken = tokenService.getToken().getAccessToken();
        try {
            return wordSegmentClient.sendAdjusterRequest(accessToken,text);
        } catch (IOException e) {
            log.error("",e);
            return new WordSegmentRes();
        }
    }
}
