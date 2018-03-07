package com.gravitydestroyer.aavishkar.activities;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gravitydestroyer.aavishkar.CardItem;
import com.gravitydestroyer.aavishkar.CardPagerAdapter;
import com.gravitydestroyer.aavishkar.R;
import com.gravitydestroyer.aavishkar.ShadowTransformer;




public class GuestActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        setTitle("Ignitia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mViewPager = (ViewPager)findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.drawable.vaishali, R.string.text_1));
        mCardAdapter.addCardItem(new CardItem(R.drawable.anurag,R.string.text_2));
        mCardAdapter.addCardItem(new CardItem(R.drawable.sabya, R.string.text_3));
        mCardAdapter.addCardItem(new CardItem(R.drawable.ashok,R.string.text_4));
        mCardAdapter.addCardItem(new CardItem(R.drawable.ajee,R.string.text_5));

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

