package com.alphawallet.app.web3.entity;

import com.alphawallet.app.entity.DAppFunction;
import com.alphawallet.token.entity.Signable;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface FunctionCallback
{
    void signMessage(Signable sign, DAppFunction dAppFunction);
    void functionSuccess();
    void functionFailed();
}
