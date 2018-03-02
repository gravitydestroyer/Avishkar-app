package com.gravitydestroyer.aavishkar.activities;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.gravitydestroyer.aavishkar.R;

import java.util.List;

public class WorkshopAdapter extends RecyclerView.Adapter<WorkshopAdapter.WorkshopViewHolder> {
    public Integer[] mThumbIds = {
            R.drawable.material, R.drawable.material,
            R.drawable.material, R.drawable.material,
            R.drawable.material
    };
    private List<Event> WEventList;
    private List<Descript> WDescriptList;
    private Context context;


    public WorkshopAdapter(Context context, List<Event> itemList, List<Descript> Des) {
        this.WEventList = itemList;
        this.context = context;
        this.WDescriptList=Des;
    }

    @Override
    public WorkshopAdapter.WorkshopViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.witem_grid, null, false);
        return new WorkshopAdapter.WorkshopViewHolder(layoutView);

    }

    @Override
    public void onBindViewHolder(WorkshopAdapter.WorkshopViewHolder holder, final int position) {
        holder.EventName.setText(WEventList.get(position).getName());
        holder.EventName.setTextSize(28);
        holder.img.setImageResource(mThumbIds[position]);
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View layout = inflater.inflate(R.layout.workshop_popup,null);
                ((ImageView)layout.findViewById(R.id.imageView4)).setImageResource(mThumbIds[position]);
                ((TextView)layout.findViewById(R.id.workshopName)).setText(WDescriptList.get(position).getDescript());
                ((TextView)layout.findViewById(R.id.workshopName)).setMovementMethod(new ScrollingMovementMethod());

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
        return this.WEventList.size();
    }

    public class WorkshopViewHolder extends RecyclerView.ViewHolder {

        private TextView EventName;
        private View container;
        private LinearLayout rel;
        private ImageView img;


        public WorkshopViewHolder(View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.imageView3);
            EventName = (TextView) itemView.findViewById(R.id.Workshop_name);
            rel=(LinearLayout)itemView.findViewById(R.id.layoutview2);
            container = itemView.findViewById(R.id.card_view2);
        }
    }


}
