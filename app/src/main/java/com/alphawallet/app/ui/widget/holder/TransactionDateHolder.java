package com.alphawallet.app.ui.widget.holder;

import android.os.Bundle;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alphawallet.app.R;

import java.util.Date;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class TransactionDateHolder extends BinderViewHolder<Date> {

    public static final int VIEW_TYPE = 1004;
    private final TextView title;

    public TransactionDateHolder(int resId, ViewGroup parent) {
        super(resId, parent);

        title = findViewById(R.id.title);
    }

    @Override
    public void bind(@Nullable Date data, @NonNull Bundle addition) {
        if (data == null) {
            title.setText(null);
        } else {
            title.setText(getDate(data));
        }
    }

    private String getDate(Date date)
    {
        if (DateUtils.isToday(date.getTime()))
        {
            return getString(R.string.today);
        }
        else
        {
            java.text.DateFormat dateFormat = java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM, getContext().getResources().getConfiguration().locale);
            return dateFormat.format(date);
        }
    }
}
