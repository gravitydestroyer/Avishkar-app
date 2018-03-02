package com.gravitydestroyer.aavishkar;

/**
 * Created by gravitydestroyer on 01/03/18.
 */

public interface KittenClickListener {
    /**
     * Called when a kitten is clicked
     * @param holder The ViewHolder for the clicked kitten
     * @param position The position in the grid of the kitten that was clicked
     */
    void onKittenClicked(KittenViewHolder holder, int position);
}