package com.gravitydestroyer.aavishkar;

/**
 * Created by gravitydestroyer on 19/02/18.
 */

public class CardItem {

    private int mTextResource;
    private int mImageResource;

    public CardItem(int image, int text) {
        mImageResource = image;
        mTextResource = text;
    }

    public int getText() {
        return mTextResource;
    }

    public int getImage() {
        return mImageResource;
    }
}
