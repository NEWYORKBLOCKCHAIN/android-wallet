package com.alphawallet.app.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class UnknownToken
{
    public long chainId;
    public String name;
    public String address;
    public boolean isPopular;

    public UnknownToken(long chainId, String address, boolean isPopular)
    {
        this.chainId = chainId;
        this.address = address;
        this.isPopular = isPopular;
    }
}
