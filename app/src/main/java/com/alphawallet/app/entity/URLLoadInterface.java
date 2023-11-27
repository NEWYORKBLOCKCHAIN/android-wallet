package com.alphawallet.app.entity;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface URLLoadInterface
{
    void onWebpageLoaded(String url, String title);
    void onWebpageLoadComplete();
}
