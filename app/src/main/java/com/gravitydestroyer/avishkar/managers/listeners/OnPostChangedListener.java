package com.gravitydestroyer.avishkar.managers.listeners;

import com.gravitydestroyer.avishkar.model.Post;

public interface OnPostChangedListener {
    public void onObjectChanged(Post obj);

    public void onError(String errorText);
}
