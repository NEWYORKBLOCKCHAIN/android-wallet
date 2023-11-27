package com.alphawallet.app.ui.widget.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface AddressReadyCallback
{
    void addressReady(String address, String ensName);
    default void resolvedAddress(String address, String ensName) { }; //ENS finished resolving an address
    default void addressValid(boolean valid) { }; //called when any text is entered
}
