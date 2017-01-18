package com.aerexu.test.aibaidu.token;

import com.aerexu.test.aibaidu.dto.response.TokenRes;
import lombok.AllArgsConstructor;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/17 11:15
 * @version: 1.0.0
 */

public class TokenAdapter {

    private TokenRes tokenRes;

    public TokenAdapter(TokenRes tokenRes) {
        if (tokenRes == null) {
            throw new NullPointerException("TokenRes can't be null!");
        }
        this.tokenRes = tokenRes;
    }

    public String getAccessToken() {
        return tokenRes.getAccessToken();
    }

    public Long getExpiresIn() {
        return tokenRes.getExpiresIn();
    }

    public String getRefreshToken() {
        return tokenRes.getRefreshToken();
    }

    public String getScope() {
        return tokenRes.getScope();
    }

    public String getSessionKey() {
        return tokenRes.getSessionKey();
    }

    public String getSessionSecret() {
        return tokenRes.getSessionSecret();
    }
}
