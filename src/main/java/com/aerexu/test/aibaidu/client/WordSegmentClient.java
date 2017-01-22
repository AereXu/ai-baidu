package com.aerexu.test.aibaidu.client;

import com.aerexu.test.aibaidu.dto.response.request.WordSegReq;
import com.aerexu.test.aibaidu.dto.response.wordseg.WordSegmentRes;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.AbstractMap;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/19 16:37
 * @version: 1.0.0
 */
@Component
public class WordSegmentClient {

    @Value("${com.baidu.ai}")
    private String baseUrl;

    public WordSegmentRes sendAdjusterRequest(String token, String text) throws IOException {
        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {
            WordSegReq wordSegReq = new WordSegReq(text);
            URI uri = new URIBuilder().setPath(baseUrl.concat("rpc/2.0/nlp/v1/wordseg")).addParameter("access_token", token).build();
            HttpPost post = new HttpPost(uri);
            post.setHeader("Authorization", token);
            StringEntity stringJson = new StringEntity(new Gson().toJson(wordSegReq), Charset.forName("GBK"));
            stringJson.setContentType("application/json");
            post.setEntity(stringJson);
            return client.execute(post, response -> {
                System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
                return new Gson().fromJson(getEntityString(response.getEntity(), "GBK"), WordSegmentRes.class);
            });
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getEntityString(HttpEntity entity, String charset) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(entity.getContent(), charset));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        return result.toString();
    }
}
