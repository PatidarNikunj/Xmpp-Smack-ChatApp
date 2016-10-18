package com.jockniks.chatapp;

import android.os.Binder;

import java.lang.ref.WeakReference;

/**
 * Created by flockstationadi12 on 18/10/16.
 */


public class LocalBinder<S> extends Binder {
    private final WeakReference<S> mService;

    public LocalBinder(final S service) {
        mService = new WeakReference<S>(service);
    }

    public S getService() {
        return mService.get();
    }

}