package com.aerexu.test.aibaidu.dto.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/17 9:24
 * @version: 1.0.0
 */
@Data
public class TokenError {
    @SerializedName("error")
    private String error;
    @SerializedName("error_description")
    private String errorDescription;
}
