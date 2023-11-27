package com.alphawallet.app.web3;

import com.alphawallet.token.entity.EthereumMessage;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnSignPersonalMessageListener {
    void onSignPersonalMessage(EthereumMessage message);
}
