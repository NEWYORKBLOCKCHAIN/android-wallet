package com.alphawallet.app.ui.widget;

import com.alphawallet.app.entity.tokens.Token;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnTokenManageClickListener
{
    void onTokenClick(Token token, int position, boolean isChecked);
}
