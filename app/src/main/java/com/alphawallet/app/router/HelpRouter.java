package com.alphawallet.app.router;


import android.content.Context;
import android.content.Intent;

import com.alphawallet.app.ui.HelpActivity;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class HelpRouter {
    public void open(Context context) {
        Intent intent = new Intent(context, HelpActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
    }
}
