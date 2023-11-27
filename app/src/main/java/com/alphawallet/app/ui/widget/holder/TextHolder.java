package com.alphawallet.app.ui.widget.holder;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alphawallet.app.R;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class TextHolder extends BinderViewHolder<String>
{
    public static final int VIEW_TYPE = 1041;

    private TextView text;

    public TextHolder(int resId, ViewGroup parent)
    {
        super(resId, parent);
        text = findViewById(R.id.text);
    }

    @Override
    public void bind(@Nullable String data, @NonNull Bundle addition)
    {
        if (data != null && data.length() > 0) text.setText(data);
    }
}
