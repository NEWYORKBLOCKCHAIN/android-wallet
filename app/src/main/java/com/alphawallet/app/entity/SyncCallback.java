package com.alphawallet.app.entity;

import android.util.Pair;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface SyncCallback
{
    void syncUpdate(String wallet, Pair<Double, Double> value);
    void syncCompleted(String wallet, Pair<Double, Double> value);
    void syncStarted(String wallet, Pair<Double, Double> value);
}
