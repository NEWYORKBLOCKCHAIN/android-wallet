package com.alphawallet.app.di;

import com.alphawallet.app.service.TokensService;
import com.alphawallet.app.viewmodel.GasSettingsViewModelFactory;

import dagger.Module;
import dagger.Provides;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
@Module
public class GasSettingsModule {

    @Provides
    public GasSettingsViewModelFactory provideGasSettingsViewModelFactory(TokensService svs) {
        return new GasSettingsViewModelFactory(svs);
    }
}
