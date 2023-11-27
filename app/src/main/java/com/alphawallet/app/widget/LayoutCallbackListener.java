package com.alphawallet.app.widget;

import android.view.View;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface LayoutCallbackListener
{
    void onLayoutShrunk();
    void onLayoutExpand();
    void onInputDoneClick(View view);
}
