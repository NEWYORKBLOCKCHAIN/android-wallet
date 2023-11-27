package com.alphawallet.app.entity;

import com.alphawallet.app.service.TokensService;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface ServiceSyncCallback
{
    void syncComplete(TokensService svs, int syncCount);
}
