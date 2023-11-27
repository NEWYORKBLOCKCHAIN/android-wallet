package com.alphawallet.app.ui.widget;

import java.io.Serializable;

import com.alphawallet.app.entity.DApp;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnDappClickListener extends Serializable {
    void onDappClick(DApp dapp);
}
