package com.alphawallet.app.di;

import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.TokensService;
import com.alphawallet.app.viewmodel.Erc1155AssetListViewModelFactory;

import dagger.Module;
import dagger.Provides;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
@Module
class Erc1155AssetListModule {
    @Provides
    Erc1155AssetListViewModelFactory provideErc1155AssetListViewModelFactory(
            AssetDefinitionService assetDefinitionService,
            TokensService tokensService)
    {
        return new Erc1155AssetListViewModelFactory(assetDefinitionService, tokensService);
    }
}
