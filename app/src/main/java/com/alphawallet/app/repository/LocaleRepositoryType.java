package com.alphawallet.app.repository;

import android.content.Context;

import java.util.ArrayList;

import com.alphawallet.app.entity.LocaleItem;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface LocaleRepositoryType {
    String getUserPreferenceLocale();
    void setUserPreferenceLocale(String locale);

    void setLocale(Context context, String locale);

    ArrayList<LocaleItem> getLocaleList(Context context);

    String getActiveLocale();

    boolean isLocalePresent(String locale);
}
