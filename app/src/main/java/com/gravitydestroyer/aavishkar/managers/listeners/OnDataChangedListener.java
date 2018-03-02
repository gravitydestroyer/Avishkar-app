package com.gravitydestroyer.aavishkar.managers.listeners;

import java.util.List;


public interface OnDataChangedListener<T> {

    public void onListChanged(List<T> list);
}
