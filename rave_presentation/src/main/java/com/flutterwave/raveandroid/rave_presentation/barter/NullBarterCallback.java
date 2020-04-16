package com.flutterwave.raveandroid.rave_presentation.barter;

import android.support.annotation.Nullable;

public class NullBarterCallback implements BarterPaymentCallback {
    @Override
    public void showProgressIndicator(boolean active) {

    }


    @Override
    public void onError(String errorMessage, @Nullable String flwRef) {

    }

    @Override
    public void onSuccessful(String flwRef) {

    }

    @Override
    public void loadBarterCheckout(String authUrlCrude, String flwRef) {

    }
}