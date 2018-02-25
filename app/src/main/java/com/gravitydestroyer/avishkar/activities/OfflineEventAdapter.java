package com.gravitydestroyer.avishkar.activities;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
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

import java.util.List;
public class OfflineEventAdapter extends RecyclerView.Adapter<OfflineEventAdapter.EventViewHolder> {
    public Integer[] mThumbIds = {
            R.drawable.sample_0, R.drawable.sample_2,
            R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_5, R.drawable.sample_6,
            R.drawable.sample_7, R.drawable.sample_1,
            R.drawable.sample_0, R.drawable.sample_5,
            R.drawable.sample_5, R.drawable.sample_5,
            R.drawable.sample_5, R.drawable.sample_5,
            R.drawable.sample_5, R.drawable.sample_5,
            R.drawable.sample_5, R.drawable.sample_5,
            R.drawable.sample_5, R.drawable.sample_5,
            R.drawable.sample_5, R.drawable.sample_5,
            R.drawable.sample_5
    };

    public int[] txtsize={40,
            26,
            30,
            28,
            34,
            33,
            26,
            38,
            44,
            50,
            28,
            39,
            30,
            29,
            38,
            36,
            28,
            38,
            32,
            38,
            36,
            31,
            26};
    public int[] heights={550,
            150,
            100,
            250,
            400,
            250,
            100,
            250,
            450,
            400,
            150,
            200,
            300,
            200,
            450,
            200,
            300,
            350,
            250,
            350,
            250,
            200,
            170};
    private List<Event> EventList;
    private List<Descript> DescriptList;
    private Context context;


    public OfflineEventAdapter(Context context, List<Event> itemList, List<Descript> Des) {
        this.EventList = itemList;
        this.context = context;
        this.DescriptList=Des;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int[] rainbow = context.getResources().getIntArray(R.array.rainbow);
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, null, false);
        return new EventViewHolder(layoutView);

    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, final int position) {
        final int[] rainbow = context.getResources().getIntArray(R.array.rainbow);
        holder.container.setMinimumHeight(heights[position]);
        holder.rel.setBackgroundColor(rainbow[position]);
        holder.rel.setMinimumHeight(heights[position]);
        holder.EventName.setText(EventList.get(position).getName());
        holder.EventName.setTextSize(txtsize[position]);
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.popuplayout,null);
                ((ImageView)layout.findViewById(R.id.imageView2)).setImageResource(mThumbIds[position]);
                ((TextView)layout.findViewById(R.id.goldName)).setText("Sumedha Rani");
                ((TextView)layout.findViewById(R.id.descriptname)).setText(DescriptList.get(position).getDescript());
                ((TextView)layout.findViewById(R.id.descriptname)).setMovementMethod(new ScrollingMovementMethod());
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
        return this.EventList.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {

        private TextView EventName;
        private View container;
        private RelativeLayout rel;
        private FloatingActionButton fab;
        public EventViewHolder(View itemView) {
            super(itemView);
            fab = (FloatingActionButton) itemView.findViewById(R.id.floatingActionButton);
            EventName = (TextView) itemView.findViewById(R.id.Event_name);
            rel=(RelativeLayout)itemView.findViewById(R.id.layoutview);
            container = itemView.findViewById(R.id.card_view);
        }
    }


}
