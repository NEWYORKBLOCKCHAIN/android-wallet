package com.alphawallet.app.util.das;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class DASRecord
{
    String key;
    String label;
    String value;
    String ttl;

    public String getAddress()
    {
        return value;
    }

    public String getLabel()
    {
        return label;
    }
}
