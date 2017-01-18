
package com.aerexu.test.aibaidu.dto.response.wordseg;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Wpbtermprop {

    @SerializedName("m_hprop")
    private Long mHprop;
    @SerializedName("m_lprop")
    private Long mLprop;

    public Long getMHprop() {
        return mHprop;
    }

    public void setMHprop(Long m_hprop) {
        mHprop = m_hprop;
    }

    public Long getMLprop() {
        return mLprop;
    }

    public void setMLprop(Long m_lprop) {
        mLprop = m_lprop;
    }

}
