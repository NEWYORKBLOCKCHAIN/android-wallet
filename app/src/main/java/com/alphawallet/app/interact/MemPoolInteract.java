package com.alphawallet.app.interact;

import com.alphawallet.app.repository.TokenRepositoryType;

import io.reactivex.Observable;

import com.alphawallet.app.entity.TransferFromEventResponse;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public class MemPoolInteract
{
    private final TokenRepositoryType tokenRepository;

    public MemPoolInteract(TokenRepositoryType tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    //create an observable
    public Observable<TransferFromEventResponse> burnListener(String contractAddress) {
        return tokenRepository.burnListenerObservable(contractAddress);
    }
}
