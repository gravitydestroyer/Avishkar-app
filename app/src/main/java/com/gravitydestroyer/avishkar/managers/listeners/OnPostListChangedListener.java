package com.gravitydestroyer.avishkar.managers.listeners;

import com.gravitydestroyer.avishkar.model.PostListResult;

public interface OnPostListChangedListener<Post> {

    public void onListChanged(PostListResult result);

    void onCanceled(String message);
}
