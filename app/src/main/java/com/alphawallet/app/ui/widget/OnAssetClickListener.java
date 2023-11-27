package com.alphawallet.app.ui.widget;


import android.util.Pair;

import com.alphawallet.app.entity.nftassets.NFTAsset;

import java.math.BigInteger;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnAssetClickListener
{
    void onAssetClicked(Pair<BigInteger, NFTAsset> item);
}
