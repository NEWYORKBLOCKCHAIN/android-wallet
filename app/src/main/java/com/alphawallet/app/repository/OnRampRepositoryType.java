package com.alphawallet.app.repository;

import com.alphawallet.app.entity.OnRampContract;
import com.alphawallet.app.entity.tokens.Token;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface OnRampRepositoryType {
    String getUri(String address, Token token);

    OnRampContract getContract(Token token);
}
