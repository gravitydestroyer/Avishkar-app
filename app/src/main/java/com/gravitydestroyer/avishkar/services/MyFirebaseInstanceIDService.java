package com.gravitydestroyer.avishkar.services;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import com.gravitydestroyer.avishkar.app.Config;



public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
   private static final String REG_TOKEN ="REG_TOKEN";
   @Override
   public void onTokenRefresh() {

       String recent_token = FirebaseInstanceId.getInstance().getToken();
       Log.d(REG_TOKEN, recent_token);
   }
   }