package com.gravitydestroyer.avishkar.activities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.gravitydestroyer.avishkar.R;
import com.gravitydestroyer.avishkar.views.TouchImageView;

public class ImageDetailActivity extends BaseActivity {

    private static final String TAG = ImageDetailActivity.class.getSimpleName();

    public static final String IMAGE_URL_EXTRA_KEY = "ImageDetailActivity.IMAGE_URL_EXTRA_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        final TouchImageView touchImageView = (TouchImageView) findViewById(R.id.touchImageView);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.image_detail_container);

        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);

            viewGroup.setOnSystemUiVisibilityChangeListener(
                    new View.OnSystemUiVisibilityChangeListener() {
                        @Override
                        public void onSystemUiVisibilityChange(int vis) {
                            if ((vis & View.SYSTEM_UI_FLAG_LOW_PROFILE) != 0) {
                                actionBar.hide();
                            } else {
                                actionBar.show();
                            }
                        }
                    });

            // Start low profile mode and hide ActionBar
            viewGroup.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE);
            actionBar.hide();
        }

        String imageUrl = getIntent().getStringExtra(IMAGE_URL_EXTRA_KEY);

        int maxImageSide = calcMaxImageSide();

        Glide.with(this)
                .load(imageUrl)
                .asBitmap()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter()
                .into(new SimpleTarget<Bitmap>(maxImageSide, maxImageSide) {
                    @Override
                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                        progressBar.setVisibility(View.GONE);
                        touchImageView.setImageBitmap(resource);
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        super.onLoadFailed(e, errorDrawable);
                        progressBar.setVisibility(View.GONE);
                        touchImageView.setImageResource(R.drawable.ic_stub);
                    }
                });

        touchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int vis = viewGroup.getSystemUiVisibility();
                if ((vis & View.SYSTEM_UI_FLAG_LOW_PROFILE) != 0) {
                    viewGroup.setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
                } else {
                    viewGroup.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE);
                }
            }
        });
    }

    private int calcMaxImageSide() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(displaymetrics);

        int width = displaymetrics.widthPixels;
        int height = displaymetrics.heightPixels;

        return width > height ? width : height;
    }
}
