package com.alphawallet.app.entity;

import com.alphawallet.token.entity.TSAction;

import java.math.BigInteger;
import java.util.List;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface StandardFunctionInterface
{
    default void selectRedeemTokens(List<BigInteger> selection) { };
    default void sellTicketRouter(List<BigInteger> selection) { };
    default void showTransferToken(List<BigInteger> selection) { };
    default void showSend() { };
    default void showReceive() { };
    default void updateAmount() { };
    default void displayTokenSelectionError(TSAction action) { };
    default void handleClick(String action, int actionId) { };
    default void handleTokenScriptFunction(String function, List<BigInteger> selection) { };
    default void showWaitSpinner(boolean show) { };
    default void handleFunctionDenied(String denialMessage) { };
}
