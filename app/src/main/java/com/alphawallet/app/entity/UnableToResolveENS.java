package com.alphawallet.app.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class UnableToResolveENS extends Exception
{
    public UnableToResolveENS(String message)
    {
        super(message);
    }
}