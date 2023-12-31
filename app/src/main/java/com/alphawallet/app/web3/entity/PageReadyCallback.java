package com.alphawallet.app.web3.entity;

import android.webkit.WebView;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface PageReadyCallback
{
    void onPageLoaded(WebView view);
    void onPageRendered(WebView view);
    default boolean overridePageLoad(WebView view, String url) { return true; }; //by default, don't allow TokenScript to access any URL
}
