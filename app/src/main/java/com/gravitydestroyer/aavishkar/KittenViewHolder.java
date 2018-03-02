package com.gravitydestroyer.aavishkar;

/**
 * Created by gravitydestroyer on 01/03/18.
 */


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class KittenViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView preview_text;

    public KittenViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.image);
        preview_text=(TextView) itemView.findViewById(R.id.preview_text);
    }
}