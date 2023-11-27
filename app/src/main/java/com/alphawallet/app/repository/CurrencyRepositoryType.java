package com.alphawallet.app.repository;

import com.alphawallet.app.entity.CurrencyItem;

import java.util.ArrayList;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface CurrencyRepositoryType {
    String getDefaultCurrency();

    void setDefaultCurrency(String currency);

    ArrayList<CurrencyItem> getCurrencyList();
}
