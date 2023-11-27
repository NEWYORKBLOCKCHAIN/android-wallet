package com.alphawallet.app.entity;

/**
 * Created by James on 3/12/2018.
 * Stormbird in Singapore
 */

import java.util.UUID;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public class TransactionMeta extends ActivityMeta
{
    public final boolean isPending;
    public final String contractAddress;
    public final long chainId;

    public TransactionMeta(String hash, long timeStamp, String contractAddress, long chainId, String blockNumber)
    {
        super(timeStamp, hash);
        this.isPending = blockNumber.equals("0") || blockNumber.equals("-2");
        this.contractAddress = contractAddress;
        this.chainId = chainId;
    }

    public long getUID()
    {
        return UUID.nameUUIDFromBytes((this.hash + "t").getBytes()).getMostSignificantBits();
    }
}
