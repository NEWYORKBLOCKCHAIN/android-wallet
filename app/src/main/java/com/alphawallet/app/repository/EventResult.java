package com.alphawallet.app.repository;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class EventResult
{
    public final String type;
    public final String value;

    public EventResult(String t, String v)
    {
        type = t;
        value = v;
    }
}
