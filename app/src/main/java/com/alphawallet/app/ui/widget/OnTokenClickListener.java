package com.alphawallet.app.ui.widget;

import android.view.View;

import com.alphawallet.app.entity.tokens.Token;

import java.math.BigInteger;
import java.util.List;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnTokenClickListener {
    void onTokenClick(View view, Token token, List<BigInteger> tokenIds, boolean selected);
    void onLongTokenClick(View view, Token token, List<BigInteger> tokenIds);
}
