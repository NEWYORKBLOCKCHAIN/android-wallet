package com.alphawallet.app.di;

import android.content.Context;

import com.alphawallet.app.interact.FetchWalletsInteract;
import com.alphawallet.app.interact.FindDefaultNetworkInteract;
import com.alphawallet.app.interact.GenericWalletInteract;
import com.alphawallet.app.interact.SetDefaultWalletInteract;
import com.alphawallet.app.repository.EthereumNetworkRepositoryType;
import com.alphawallet.app.repository.TokenRepositoryType;
import com.alphawallet.app.repository.WalletRepositoryType;
import com.alphawallet.app.router.HomeRouter;
import com.alphawallet.app.router.ImportWalletRouter;
import com.alphawallet.app.service.AssetDefinitionService;
import com.alphawallet.app.service.KeyService;
import com.alphawallet.app.service.TickerService;
import com.alphawallet.app.viewmodel.WalletsViewModelFactory;

import dagger.Module;
import dagger.Provides;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
@Module
class AccountsManageModule {

	@Provides
	WalletsViewModelFactory provideAccountsManageViewModelFactory(
			SetDefaultWalletInteract setDefaultWalletInteract,
			FetchWalletsInteract fetchWalletsInteract,
			GenericWalletInteract genericWalletInteract,
			ImportWalletRouter importWalletRouter,
			HomeRouter homeRouter,
			FindDefaultNetworkInteract findDefaultNetworkInteract,
			KeyService keyService,
			EthereumNetworkRepositoryType ethereumNetworkRepository,
			TokenRepositoryType tokenRepository,
			TickerService tickerService,
			AssetDefinitionService assetDefinitionService,
			Context context)
	{
		return new WalletsViewModelFactory(setDefaultWalletInteract,
				fetchWalletsInteract,
				genericWalletInteract,
				importWalletRouter,
				homeRouter,
				findDefaultNetworkInteract,
				keyService,
				ethereumNetworkRepository,
				tokenRepository,
				tickerService,
				assetDefinitionService,
				context);
	}

	@Provides
	SetDefaultWalletInteract provideSetDefaultAccountInteract(WalletRepositoryType accountRepository) {
		return new SetDefaultWalletInteract(accountRepository);
	}

	@Provides
	FetchWalletsInteract provideFetchAccountsInteract(WalletRepositoryType accountRepository) {
		return new FetchWalletsInteract(accountRepository);
	}

	@Provides
	GenericWalletInteract provideFindDefaultAccountInteract(WalletRepositoryType accountRepository) {
		return new GenericWalletInteract(accountRepository);
	}

	@Provides
	ImportWalletRouter provideImportAccountRouter() {
		return new ImportWalletRouter();
	}

	@Provides
	HomeRouter provideHomeRouter() {
		return new HomeRouter();
	}

	@Provides
	FindDefaultNetworkInteract provideFindDefaultNetworkInteract(
			EthereumNetworkRepositoryType networkRepository) {
		return new FindDefaultNetworkInteract(networkRepository);
	}
}
