package com.alphawallet.app.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public interface BaseViewCallback {
    void queueUpdate(int complete);
    void pushToast(String message);
}
