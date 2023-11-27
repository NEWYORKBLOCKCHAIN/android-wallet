package com.alphawallet.app.walletconnect.entity;

import com.alphawallet.app.entity.walletconnect.WCRequest;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface WalletConnectCallback
{
    boolean receiveRequest(WCRequest request);
}
