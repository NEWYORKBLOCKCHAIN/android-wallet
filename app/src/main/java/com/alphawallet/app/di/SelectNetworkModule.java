package com.alphawallet.app.di;

import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.service.TokensService;
import com.alphawallet.app.viewmodel.SelectNetworkViewModelFactory;

import dagger.Module;
import dagger.Provides;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
@Module
class SelectNetworkModule {
    @Provides
    SelectNetworkViewModelFactory provideSelectNetworkViewModelFactory(EthereumNetworkRepositoryType networkRepositoryType,
                                                                       TokensService tokensService,
                                                                       PreferenceRepositoryType preferenceRepositoryType)
    {
        return new SelectNetworkViewModelFactory(networkRepositoryType, tokensService, preferenceRepositoryType);
    }
}
