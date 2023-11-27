package com.alphawallet.app.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class ItemClick
{
    public final String buttonText;
    public final int buttonId;

    public ItemClick(String text, int id)
    {
        buttonId = id;
        buttonText = text;
    }
}
