package com.alphawallet.app.ui.widget;


import com.alphawallet.app.entity.nftassets.NFTAsset;

import java.math.BigInteger;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnAssetSelectListener
{
    void onAssetSelected(BigInteger tokenId, NFTAsset asset, int position);
    void onAssetUnselected();
}
