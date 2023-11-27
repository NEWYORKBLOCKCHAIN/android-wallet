package com.alphawallet.app.ui.widget.entity;

import java.math.BigInteger;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface GasSettingsCallback
{
    void gasSettingsUpdate(BigInteger gasPrice, BigInteger gasLimit);
}
