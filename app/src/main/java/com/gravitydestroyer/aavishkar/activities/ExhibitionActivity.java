package com.gravitydestroyer.aavishkar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gravitydestroyer.aavishkar.R;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gravitydestroyer.aavishkar.CardItem;
import com.gravitydestroyer.aavishkar.CardPagerAdapter;
import com.gravitydestroyer.aavishkar.R;
import com.gravitydestroyer.aavishkar.ShadowTransformer;

import android.widget.Button;


public class ExhibitionActivity extends AppCompatActivity {


    private ViewPager mViewPager;

    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibition);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mViewPager = (ViewPager)findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.drawable.armyv, R.string.text1));
        mCardAdapter.addCardItem(new CardItem(R.drawable.ensign, R.string.text2));
        mCardAdapter.addCardItem(new CardItem(R.drawable.cycle, R.string.text3));
        mCardAdapter.addCardItem(new CardItem(R.drawable.entz,R.string.text4));
        mCardAdapter.addCardItem(new CardItem(R.drawable.autoexpo, R.string.text5));
        mCardAdapter.addCardItem(new CardItem(R.drawable.strokes, R.string.text6));

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);


        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);

    }
    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);

    }

}

