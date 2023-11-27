package com.alphawallet.app.entity;

import com.alphawallet.token.entity.Signable;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface DAppFunction
{
    void DAppError(Throwable error, Signable message);
    void DAppReturn(byte[] data, Signable message);
}
