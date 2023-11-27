package com.alphawallet.app.entity;


import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigInteger;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class GasSettings implements Parcelable {
    public final BigInteger gasPrice;
    public final BigInteger gasLimit;

    public GasSettings(BigInteger gasPrice, BigInteger gasLimit) {
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
    }

    private GasSettings(Parcel in) {
        gasPrice = new BigInteger(in.readString());
        gasLimit = new BigInteger(in.readString());
    }

    public static final Creator<GasSettings> CREATOR = new Creator<GasSettings>() {
        @Override
        public GasSettings createFromParcel(Parcel in) {
            return new GasSettings(in);
        }

        @Override
        public GasSettings[] newArray(int size) {
            return new GasSettings[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(gasPrice.toString(10));
        parcel.writeString(gasLimit.toString(10));
    }
}
