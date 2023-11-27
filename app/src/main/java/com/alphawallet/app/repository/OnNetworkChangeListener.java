package com.alphawallet.app.repository;

import com.alphawallet.app.entity.NetworkInfo;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnNetworkChangeListener {
	void onNetworkChanged(NetworkInfo networkInfo);
}
