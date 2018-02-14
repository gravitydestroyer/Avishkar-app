package com.gravitydestroyer.avishkar;

import com.gravitydestroyer.avishkar.managers.DatabaseHelper;

public class Application extends android.app.Application {

    public static final String TAG = Application.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        ApplicationHelper.initDatabaseHelper(this);
        DatabaseHelper.getInstance(this).subscribeToNewPosts();
    }
}
