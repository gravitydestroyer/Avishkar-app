package com.gravitydestroyer.aavishkar.managers.listeners;

import com.gravitydestroyer.aavishkar.model.Post;

public interface OnPostChangedListener {
    public void onObjectChanged(Post obj);

    public void onError(String errorText);
}
