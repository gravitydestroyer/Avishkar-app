package com.gravitydestroyer.aavishkar.activities;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gravitydestroyer.aavishkar.R;

import java.util.List;

public class OnlineEventAdapter extends RecyclerView.Adapter<OnlineEventAdapter.OnlineEventViewHolder> {
    public Integer[] mThumbIds = {
            R.drawable.material, R.drawable.material,
            R.drawable.material, R.drawable.material,
            R.drawable.material, R.drawable.material,
            R.drawable.material, R.drawable.material,
            R.drawable.material, R.drawable.material,
    };
    public int[] txtsize={36,
            32,
            38,
            39,
            38,
            36,
            31,
            30};
    public int[] heights={
            450,
            250,
            200,
            350,
            350,
            200,
            250,
            200};
    private List<Event> OEventList;
    private List<Descript> ODescriptList;
    private Context context;


    public OnlineEventAdapter(Context context, List<Event> itemList, List<Descript> Des) {
        this.OEventList = itemList;
        this.context = context;
        this.ODescriptList=Des;
    }

    @Override
    public OnlineEventAdapter.OnlineEventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int[] rainbow = context.getResources().getIntArray(R.array.rainbow);
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, null, false);
        return new OnlineEventAdapter.OnlineEventViewHolder(layoutView);

    }

    @Override
    public void onBindViewHolder(OnlineEventAdapter.OnlineEventViewHolder holder, final int position) {
        final int[] rainbow = context.getResources().getIntArray(R.array.rainbow);
        holder.card.setMinimumHeight(heights[position]);
        holder.rel.setBackgroundColor(rainbow[position+14]);
        holder.rel.setMinimumHeight(heights[position]);
        holder.EventName.setText(OEventList.get(position).getName());
        holder.EventName.setTextSize(txtsize[position]);
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View layout = inflater.inflate(R.layout.popuplayout,null);
                ((ImageView)layout.findViewById(R.id.imageView2)).setImageResource(mThumbIds[position]);
                ((TextView)layout.findViewById(R.id.goldName)).setText(ODescriptList.get(position).getDescript());
                ((TextView)layout.findViewById(R.id.goldName)).setMovementMethod(new ScrollingMovementMethod());

                float density=context.getResources().getDisplayMetrics().density;
                final PopupWindow pw = new PopupWindow(layout, (int)density*330, (int)density*450, true);

                pw.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                pw.setTouchInterceptor(new View.OnTouchListener() {
                    public boolean onTouch(View v, MotionEvent event) {
                        if(event.getAction() == MotionEvent.ACTION_OUTSIDE) {
                            pw.dismiss();
                            return true;
                        }
                        return false;
                    }
                });
                pw.setOutsideTouchable(true);
                pw.showAtLocation(layout, Gravity.CENTER, 0, 0);

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.OEventList.size();
    }

    public class OnlineEventViewHolder extends RecyclerView.ViewHolder {

        private CardView card;
        private TextView EventName;
        private View container;
        private RelativeLayout rel;


        public OnlineEventViewHolder(View itemView) {
            super(itemView);
            card=(CardView) itemView.findViewById(R.id.card_view);
            EventName = (TextView) itemView.findViewById(R.id.Event_name);
            rel=(RelativeLayout)itemView.findViewById(R.id.layoutview);
            container = itemView.findViewById(R.id.card_view);
        }
    }


}