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
        mViewPager = (ViewPager)findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.drawable.armyshow,R.string.title_1, R.string.text1));
        mCardAdapter.addCardItem(new CardItem(R.drawable.ensig,R.string.title_2, R.string.text2));
        mCardAdapter.addCardItem(new CardItem(R.drawable.stunts,R.string.title_3, R.string.text3));
        mCardAdapter.addCardItem(new CardItem(R.drawable.enzffsht,R.string.title_4,R.string.text4));
        mCardAdapter.addCardItem(new CardItem(R.drawable.autoexp,R.string.title_4, R.string.text5));

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

