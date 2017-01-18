
package com.aerexu.test.aibaidu.dto.response;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CommonError {

    @SerializedName("error_code")
    private Long errorCode;
    @SerializedName("error_msg")
    private String errorMsg;

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long error_code) {
        errorCode = error_code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String error_msg) {
        errorMsg = error_msg;
    }

}
