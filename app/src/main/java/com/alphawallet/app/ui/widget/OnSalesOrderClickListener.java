package com.alphawallet.app.ui.widget;

import android.view.View;

import com.alphawallet.token.entity.MagicLinkData;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public interface OnSalesOrderClickListener {
    void onOrderClick (View view, MagicLinkData range);
}
