
package com.aerexu.test.aibaidu.dto.response.wordseg;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Pdisambword {

    @SerializedName("newwordb_curpos")
    private Long newwordbCurpos;
    @SerializedName("newwordbmaxcount")
    private Long newwordbmaxcount;
    @SerializedName("newwordbsize")
    private Long newwordbsize;
    @SerializedName("newwordbtermcount")
    private Long newwordbtermcount;
    @SerializedName("newwordbtermoffsets")
    private List<Object> newwordbtermoffsets;
    @SerializedName("newwordbtermpos")
    private List<Object> newwordbtermpos;
    @SerializedName("newwordbuf")
    private String newwordbuf;
    @SerializedName("newwordneprop")
    private List<Newwordneprop> newwordneprop;

    public Long getNewwordbCurpos() {
        return newwordbCurpos;
    }

    public void setNewwordbCurpos(Long newwordb_curpos) {
        newwordbCurpos = newwordb_curpos;
    }

    public Long getNewwordbmaxcount() {
        return newwordbmaxcount;
    }

    public void setNewwordbmaxcount(Long newwordbmaxcount) {
        this.newwordbmaxcount = newwordbmaxcount;
    }

    public Long getNewwordbsize() {
        return newwordbsize;
    }

    public void setNewwordbsize(Long newwordbsize) {
        this.newwordbsize = newwordbsize;
    }

    public Long getNewwordbtermcount() {
        return newwordbtermcount;
    }

    public void setNewwordbtermcount(Long newwordbtermcount) {
        this.newwordbtermcount = newwordbtermcount;
    }

    public List<Object> getNewwordbtermoffsets() {
        return newwordbtermoffsets;
    }

    public void setNewwordbtermoffsets(List<Object> newwordbtermoffsets) {
        this.newwordbtermoffsets = newwordbtermoffsets;
    }

    public List<Object> getNewwordbtermpos() {
        return newwordbtermpos;
    }

    public void setNewwordbtermpos(List<Object> newwordbtermpos) {
        this.newwordbtermpos = newwordbtermpos;
    }

    public String getNewwordbuf() {
        return newwordbuf;
    }

    public void setNewwordbuf(String newwordbuf) {
        this.newwordbuf = newwordbuf;
    }

    public List<Newwordneprop> getNewwordneprop() {
        return newwordneprop;
    }

    public void setNewwordneprop(List<Newwordneprop> newwordneprop) {
        this.newwordneprop = newwordneprop;
    }

}
