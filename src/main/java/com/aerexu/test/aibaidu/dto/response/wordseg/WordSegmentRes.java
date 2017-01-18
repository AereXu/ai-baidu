
package com.aerexu.test.aibaidu.dto.response.wordseg;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class WordSegmentRes {

    @SerializedName("scw_out")
    private ScwOut scwOut;

    public ScwOut getScwOut() {
        return scwOut;
    }

    public void setScwOut(ScwOut scw_out) {
        scwOut = scw_out;
    }

}
