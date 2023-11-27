package com.alphawallet.app.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

import com.alphawallet.app.BuildConfig;
import com.alphawallet.app.C;
import com.alphawallet.app.entity.AnalyticsProperties;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class AnalyticsService<T> implements AnalyticsServiceType<T> {


    public static native String getAnalyticsKey();

    static {
        System.loadLibrary("keys");
    }

    public AnalyticsService(Context context)
    {

    }

    @Override
    public void track(String eventName)
    {
        //firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, eventName);
    }

    @Override
    public void track(String eventName, T event)
    {
        AnalyticsProperties analyticsProperties = (AnalyticsProperties) event;

        trackFirebase(analyticsProperties, eventName);
        trackMixpanel(analyticsProperties, eventName);
    }

    private void trackFirebase(AnalyticsProperties analyticsProperties, String eventName)
    {
        Bundle props = new Bundle();
        if(!TextUtils.isEmpty(analyticsProperties.getWalletType()))
        {
            props.putString(C.AN_WALLET_TYPE, analyticsProperties.getWalletType());
        }

        if(!TextUtils.isEmpty(analyticsProperties.getData()))
        {
            props.putString(C.AN_USE_GAS, analyticsProperties.getData());
        }

        props.putString(C.APP_NAME, BuildConfig.APPLICATION_ID);

    }

    private void trackMixpanel(AnalyticsProperties analyticsProperties, String eventName)
    {
        try
        {
            JSONObject props = new JSONObject();

            if (!TextUtils.isEmpty(analyticsProperties.getWalletType()))
            {
                props.put(C.AN_WALLET_TYPE, analyticsProperties.getWalletType());
            }

            if (!TextUtils.isEmpty(analyticsProperties.getData()))
            {
                props.put(C.AN_USE_GAS, analyticsProperties.getData());
            }

        }
        catch(JSONException e)
        {
            //Something went wrong
        }
    }

    @Override
    public void identify(String uuid)
    {

    }

    @Override
    public void flush()
    {
        //Nothing like flush in firebase
    }
}