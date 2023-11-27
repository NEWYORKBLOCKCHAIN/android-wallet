package com.alphawallet.app.di;

import com.alphawallet.app.repository.PreferenceRepositoryType;
import com.alphawallet.app.viewmodel.TransactionSuccessViewModelFactory;

import dagger.Module;
import dagger.Provides;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
@Module
class TransactionSuccessModule {

    @Provides
    TransactionSuccessViewModelFactory provideTransactionSuccessViewModelFactory(PreferenceRepositoryType preferenceRepository) {
        return new TransactionSuccessViewModelFactory(
                preferenceRepository);
    }
}
