package com.alphawallet.app.entity;

import com.alphawallet.app.web3.entity.Web3Transaction;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface SendTransactionInterface
{
    void transactionSuccess(Web3Transaction web3Tx, String hashData);
    void transactionError(long callbackId, Throwable error);
}
