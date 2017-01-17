
package com.aerexu.test.aibaidu.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
public class TokenRes {

    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("expires_in")
    private Long expiresIn;
    @SerializedName("refresh_token")
    private String refreshToken;
    @SerializedName("scope")
    private String scope;
    @SerializedName("session_key")
    private String sessionKey;
    @SerializedName("session_secret")
    private String sessionSecret;

}
