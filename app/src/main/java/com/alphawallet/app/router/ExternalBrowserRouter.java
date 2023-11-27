package com.alphawallet.app.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class ExternalBrowserRouter {

    public void open(Context context, Uri uri) {
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
        context.startActivity(launchBrowser);
    }
}
