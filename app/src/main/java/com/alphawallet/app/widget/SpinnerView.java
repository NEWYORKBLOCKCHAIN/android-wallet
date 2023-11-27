package com.alphawallet.app.widget;

import android.content.Context;
import android.widget.RelativeLayout;

import com.alphawallet.app.R;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class SpinnerView extends RelativeLayout {
    public SpinnerView(Context context) {
        super(context);
        inflate(context, R.layout.item_spinner_view, this);
    }
}
