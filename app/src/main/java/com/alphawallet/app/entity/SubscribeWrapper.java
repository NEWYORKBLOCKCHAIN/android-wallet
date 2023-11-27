package com.alphawallet.app.entity;

import org.web3j.protocol.core.methods.response.Transaction;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public interface SubscribeWrapper
{
    void scanReturn(Transaction tx);
}
