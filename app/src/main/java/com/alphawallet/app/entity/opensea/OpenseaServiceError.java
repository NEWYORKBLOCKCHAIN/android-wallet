package com.alphawallet.app.entity.opensea;

import com.alphawallet.app.entity.ErrorEnvelope;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public class OpenseaServiceError extends Exception {
    public final ErrorEnvelope error;

    public OpenseaServiceError(String message) {
        super(message);

        error = new ErrorEnvelope(message);
    }
}
