package com.alphawallet.app.di;

import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.viewmodel.TokenScriptManagementViewModelFactory;

import dagger.Module;
import dagger.Provides;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
@Module
class TokenScriptManagementModule {
    @Provides
    TokenScriptManagementViewModelFactory tokenScriptManagementViewModelFactory(AssetDefinitionService assetDefinitionService)
    {
        return new TokenScriptManagementViewModelFactory(assetDefinitionService);
    }
}
