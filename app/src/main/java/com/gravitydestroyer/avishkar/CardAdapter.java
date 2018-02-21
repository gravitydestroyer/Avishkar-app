package com.gravitydestroyer.avishkar;

/**
 * Created by gravitydestroyer on 19/02/18.
 */

import android.support.v7.widget.CardView;

public interface CardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
