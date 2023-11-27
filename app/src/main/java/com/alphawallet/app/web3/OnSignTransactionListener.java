package com.alphawallet.app.web3;

import com.alphawallet.app.web3.entity.Web3Transaction;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnSignTransactionListener {
    void onSignTransaction(Web3Transaction transaction, String url);
}
