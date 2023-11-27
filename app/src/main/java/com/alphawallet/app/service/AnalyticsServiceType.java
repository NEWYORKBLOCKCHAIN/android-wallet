package com.alphawallet.app.service;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface AnalyticsServiceType<T> {

    void track(String eventName);

    void track(String eventName, T event);

    void flush();

    void identify(String uuid);
}