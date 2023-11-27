package com.alphawallet.app.web3;

import com.alphawallet.app.web3.entity.Web3Call;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnEthCallListener
{
    void onEthCall(Web3Call txdata);
}
