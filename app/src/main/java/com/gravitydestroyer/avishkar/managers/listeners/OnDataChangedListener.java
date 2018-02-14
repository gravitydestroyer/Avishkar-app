package com.gravitydestroyer.avishkar.managers.listeners;

import java.util.List;


public interface OnDataChangedListener<T> {

    public void onListChanged(List<T> list);
}
