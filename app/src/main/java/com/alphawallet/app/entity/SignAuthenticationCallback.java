package com.alphawallet.app.entity;

import com.alphawallet.token.entity.Signable;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface SignAuthenticationCallback
{
    void gotAuthorisation(boolean gotAuth);
    default void gotAuthorisationForSigning(boolean gotAuth, Signable messageToSign) { }; //if you implement message signing
    default void createdKey(String keyAddress) { };
    void cancelAuthentication();
}