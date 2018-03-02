package com.gravitydestroyer.aavishkar;

/**
 * Created by gravitydestroyer on 01/03/18.
 */


import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class KittenGridAdapter extends RecyclerView.Adapter<KittenViewHolder> {
    private final int mSize;
    private final KittenClickListener mListener;

    /**
     * Constructor
     * @param size The number of kittens to show
     * @param listener A listener for kitten click events
     */
    public KittenGridAdapter(int size, KittenClickListener listener) {
        mSize = size;
        mListener = listener;
    }

    @Override
    public KittenViewHolder onCreateViewHolder(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View cell = inflater.inflate(R.layout.grid_item, container, false);

        return new KittenViewHolder(cell);
    }

    @Override
    public void onBindViewHolder(final KittenViewHolder viewHolder, final int position) {
        switch (position % 3) {

            case 0:
                viewHolder.image.setImageResource(R.drawable.analyt);
                viewHolder.preview_text.setText("Data Analytics.");
                break;
            case 1:
                viewHolder.image.setImageResource(R.drawable.ethhck);
                viewHolder.preview_text.setText("Ethical Hacking");
                break;
            case 2:
                viewHolder.image.setImageResource(R.drawable.gesture);
                viewHolder.preview_text.setText("Gesture Controlled Robotics");
                break;

        }

        // It is important that each shared element in the source screen has a unique transition name.
        // For example, we can't just give all the images in our grid the transition name "kittenImage"
        // because then we would have conflicting transition names.
        // By appending "_image" to the position, we can support having multiple shared elements in each
        // grid cell in the future.
        ViewCompat.setTransitionName(viewHolder.image, String.valueOf(position) + "_image");

        viewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onKittenClicked(viewHolder, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSize;
    }

}
