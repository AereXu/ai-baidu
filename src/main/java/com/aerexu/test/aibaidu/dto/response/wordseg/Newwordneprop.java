
package com.aerexu.test.aibaidu.dto.response.wordseg;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Newwordneprop {

    @SerializedName("iNeName")
    private String iNeName;
    @SerializedName("iWeight")
    private Long iWeight;

    public String getINeName() {
        return iNeName;
    }

    public void setINeName(String iNeName) {
        this.iNeName = iNeName;
    }

    public Long getIWeight() {
        return iWeight;
    }

    public void setIWeight(Long iWeight) {
        this.iWeight = iWeight;
    }

}
