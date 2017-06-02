package com.example.ruchitiwari.googleanalytics.otp.sms;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

public class SMSHistoryObserver extends ContentObserver {

    public interface OnSMSObserver {
        void onChange(boolean z, Uri uri);
    }

    private OnSMSObserver mObserver;

    public SMSHistoryObserver(Handler handler, OnSMSObserver observer) {
        super(handler);
        if (observer == null) {
            throw new IllegalArgumentException("SMS Observer can't be null");
        }
        this.mObserver = observer;
    }

    public void onChange(boolean z, Uri uri) {
        this.mObserver.onChange(z, uri);
    }
}
