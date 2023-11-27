package com.alphawallet.app.entity;

import java.util.UUID;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class EventMeta extends ActivityMeta
{
    public final long chainId;
    public final String eventName;
    public final String activityCardName;

    public EventMeta(String txHash, String eName, String cardName, long timeStamp, long chainId)
    {
        super(timeStamp, txHash);
        this.chainId = chainId;
        this.eventName = eName;
        this.activityCardName = cardName;
    }

    public long getUID()
    {
        return UUID.nameUUIDFromBytes((this.hash + eventName).getBytes()).getMostSignificantBits();
    }
}
