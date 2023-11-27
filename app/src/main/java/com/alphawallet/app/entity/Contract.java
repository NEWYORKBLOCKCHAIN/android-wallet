package com.alphawallet.app.entity;

/**
 * Created by James on 26/02/2019.
 * Stormbird in Singapore
 */

import com.alphawallet.app.entity.tokens.TokenInfo;

import java.math.BigDecimal;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public abstract class Contract
{
    public TokenInfo tokenInfo;
    public BigDecimal balance;
    public long updateBlancaTime;
    public boolean balanceIsLive = false;
    private String tokenWallet;
    private short tokenNetwork;
    private boolean requiresAuxRefresh = true;
    protected ContractType contractType;
    public long lastBlockCheck = 0;
}
