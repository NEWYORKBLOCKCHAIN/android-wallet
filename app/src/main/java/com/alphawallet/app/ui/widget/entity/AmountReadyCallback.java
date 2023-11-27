package com.alphawallet.app.ui.widget.entity;

import java.math.BigDecimal;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface AmountReadyCallback
{
    void amountReady(BigDecimal value, BigDecimal gasFee);
    default void updateCryptoAmount(BigDecimal value) { };
}
