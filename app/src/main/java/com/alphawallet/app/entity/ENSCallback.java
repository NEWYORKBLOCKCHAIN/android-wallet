package com.alphawallet.app.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public interface ENSCallback
{
    void ENSComplete();
    void displayCheckingDialog(boolean shouldShow);
    void ENSResolved(String address, String ens);
    void ENSName(String name);
}
