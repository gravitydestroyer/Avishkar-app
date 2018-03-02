package com.gravitydestroyer.aavishkar.model;


import com.gravitydestroyer.aavishkar.enums.ItemType;

public interface LazyLoading {
    ItemType getItemType();
    void setItemType(ItemType itemType);
}
