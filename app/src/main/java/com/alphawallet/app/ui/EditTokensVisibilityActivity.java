package com.alphawallet.app.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;

import dagger.android.AndroidInjection;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class EditTokensVisibilityActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
