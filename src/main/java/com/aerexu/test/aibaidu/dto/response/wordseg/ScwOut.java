
package com.aerexu.test.aibaidu.dto.response.wordseg;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
public class ScwOut {

    @SerializedName("bnb_curpos")
    private Long bnbCurpos;
    @SerializedName("bnbsize")
    private Long bnbsize;
    @SerializedName("bnbtermcount")
    private Long bnbtermcount;
    @SerializedName("bnbtermoffsets")
    private List<Object> bnbtermoffsets;
    @SerializedName("bnbtermpos")
    private List<Object> bnbtermpos;
    @SerializedName("bnbtermprop")
    private List<Object> bnbtermprop;
    @SerializedName("booknamebuf")
    private String booknamebuf;
    @SerializedName("mb_curpos")
    private Long mbCurpos;
    @SerializedName("mbsize")
    private Long mbsize;
    @SerializedName("mbtermcount")
    private Long mbtermcount;
    @SerializedName("mbtermoffsets")
    private List<Object> mbtermoffsets;
    @SerializedName("mbtermpos")
    private List<Object> mbtermpos;
    @SerializedName("mergebuf")
    private String mergebuf;
    @SerializedName("nameb_curpos")
    private Long namebCurpos;
    @SerializedName("namebsize")
    private Long namebsize;
    @SerializedName("namebtermcount")
    private Long namebtermcount;
    @SerializedName("namebtermoffsets")
    private List<Object> namebtermoffsets;
    @SerializedName("namebtermpos")
    private List<Object> namebtermpos;
    @SerializedName("namebtermprop")
    private List<Object> namebtermprop;
    @SerializedName("namebuf")
    private String namebuf;
    @SerializedName("pdisambword")
    private Pdisambword pdisambword;
    @SerializedName("phrase_merged")
    private Long phraseMerged;
    @SerializedName("pnewword")
    private Pnewword pnewword;
    @SerializedName("spb_curpos")
    private Long spbCurpos;
    @SerializedName("spbsize")
    private Long spbsize;
    @SerializedName("spbtermcount")
    private Long spbtermcount;
    @SerializedName("spbtermoffsets")
    private List<Object> spbtermoffsets;
    @SerializedName("spbtermpos")
    private List<Object> spbtermpos;
    @SerializedName("spbtermprop")
    private List<Object> spbtermprop;
    @SerializedName("subphrbuf")
    private String subphrbuf;
    @SerializedName("wordsepbuf")
    private String wordsepbuf;
    @SerializedName("wordtotallen")
    private Long wordtotallen;
    @SerializedName("wpb_curpos")
    private Long wpbCurpos;
    @SerializedName("wpbsize")
    private Long wpbsize;
    @SerializedName("wpbtermcount")
    private Long wpbtermcount;
    @SerializedName("wpbtermoffsets")
    private List<Long> wpbtermoffsets;
    @SerializedName("wpbtermpos")
    private List<Long> wpbtermpos;
    @SerializedName("wpbtermprop")
    private List<Wpbtermprop> wpbtermpropList;
    @SerializedName("wpcompbuf")
    private String wpcompbuf;
    @SerializedName("wsb_curpos")
    private Long wsbCurpos;
    @SerializedName("wsbsize")
    private Long wsbsize;
    @SerializedName("wsbtermcount")
    private Long wsbtermcount;
    @SerializedName("wsbtermoffsets")
    private List<Long> wsbtermoffsets;
    @SerializedName("wsbtermpos")
    private List<Long> wsbtermpos;
    @SerializedName("wsbtermprop")
    private List<Wsbtermprop> wsbtermpropList;

}
