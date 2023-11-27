package com.alphawallet.app.viewmodel;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class CreateAccountViewModelFactory implements ViewModelProvider.Factory {

	public CreateAccountViewModelFactory() { }

	@NonNull
	@Override
	public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
		return (T) new CreateAccountViewModel();
	}
}
