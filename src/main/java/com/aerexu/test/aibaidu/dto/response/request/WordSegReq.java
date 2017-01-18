package com.aerexu.test.aibaidu.dto.response.request;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.annotation.Generated;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/17 11:11
 * @version: 1.0.0
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@RequiredArgsConstructor
public class WordSegReq {
    @SerializedName("lang_id")
    private Long langId = 1L;
    @SerializedName("query")
    @NonNull
    private String query;
}
