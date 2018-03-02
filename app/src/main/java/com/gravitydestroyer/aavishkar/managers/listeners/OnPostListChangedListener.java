package com.gravitydestroyer.aavishkar.managers.listeners;

import com.gravitydestroyer.aavishkar.model.PostListResult;

public interface OnPostListChangedListener<Post> {

    public void onListChanged(PostListResult result);

    void onCanceled(String message);
}
