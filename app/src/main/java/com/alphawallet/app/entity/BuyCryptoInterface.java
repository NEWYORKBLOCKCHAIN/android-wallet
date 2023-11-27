package com.alphawallet.app.entity;

import com.alphawallet.app.entity.tokens.Token;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface BuyCryptoInterface {
    void handleBuyFunction(Token token);
    void handleGeneratePaymentRequest(Token token);
}
