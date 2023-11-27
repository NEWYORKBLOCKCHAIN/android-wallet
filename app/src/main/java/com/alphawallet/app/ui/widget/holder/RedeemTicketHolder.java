package com.alphawallet.app.ui.widget.holder;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alphawallet.app.R;
import com.alphawallet.app.entity.tokens.Token;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public class RedeemTicketHolder extends BinderViewHolder<Token> {

    public static final int VIEW_TYPE = 1299;

    private final TextView title;

    public RedeemTicketHolder(int resId, ViewGroup parent) {
        super(resId, parent);
        title = findViewById(R.id.name);
    }

    @Override
    public void bind(@Nullable Token token, @NonNull Bundle addition)
    {
        title.setText(R.string.select_tickets_redeem);
    }
}
