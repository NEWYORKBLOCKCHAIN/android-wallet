package com.alphawallet.app.entity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class KnownContract {

    @SerializedName("MainNet")
    @Expose
    private List<UnknownToken> mainNet = null;

    @SerializedName("xDAI")
    @Expose
    private List<UnknownToken> xDAI = null;

    public List<UnknownToken> getMainNet() {
        return mainNet;
    }

    public List<UnknownToken> getXDAI() {
        return xDAI;
    }


    @SerializedName("BNB")
    @Expose
    private List<UnknownToken> BNB = null;

    public List<UnknownToken> getBNB() {
        return BNB;
    }

    @SerializedName("AVA")
    @Expose
    private List<UnknownToken> AVA = null;

    public List<UnknownToken> getAVA() {
        return AVA;
    }

    @SerializedName("MATIC")
    @Expose
    private List<UnknownToken> MATIC = null;

    public List<UnknownToken> getMATIC() {
        return MATIC;
    }
}