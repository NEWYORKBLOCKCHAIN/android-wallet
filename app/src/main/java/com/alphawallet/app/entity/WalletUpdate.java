package com.alphawallet.app.entity;

import java.util.Map;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public class WalletUpdate
{
    public long lastBlock;
    public Map<String, Wallet> wallets;

    public WalletUpdate()
    {
        lastBlock = -1L;
    }
}
