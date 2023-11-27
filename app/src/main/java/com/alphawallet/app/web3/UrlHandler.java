package com.alphawallet.app.web3;

import android.net.Uri;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface UrlHandler {

    String getScheme();

    String handle(Uri uri);
}