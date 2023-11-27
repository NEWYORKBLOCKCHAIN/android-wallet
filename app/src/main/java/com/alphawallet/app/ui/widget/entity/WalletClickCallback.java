package com.alphawallet.app.ui.widget.entity;

import com.alphawallet.app.entity.Wallet;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface WalletClickCallback
{
    void onWalletClicked(Wallet wallet);
    void ensAvatar(Wallet wallet);
}
