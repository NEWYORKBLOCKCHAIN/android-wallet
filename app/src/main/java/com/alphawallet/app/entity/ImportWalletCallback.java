package com.alphawallet.app.entity;
import com.alphawallet.app.entity.cryptokeys.KeyEncodingType;
import com.alphawallet.app.service.KeyService;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface ImportWalletCallback
{
    void walletValidated(String address, KeyEncodingType type, KeyService.AuthenticationLevel level);
}
