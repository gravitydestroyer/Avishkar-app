package com.gravitydestroyer.aavishkar;

/**
 * Created by gravitydestroyer on 19/02/18.
 */

public class CardItem {

    private int mTextResource;
    private int mtexttitle;
    private int mImageResource;

    public CardItem(int image, int text1, int text2) {
        mImageResource = image;
        mtexttitle=text1;
        mTextResource = text2;
    }

    public int getText() {
        return mTextResource;
    }

    public int getText2() { return mtexttitle;}

    public int getImage() {
        return mImageResource;
    }
}
