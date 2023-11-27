package com.alphawallet.app.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface FragmentMessenger
{
    void tokenScriptError(String message);
    void updateReady(int versionUpdate);
}
