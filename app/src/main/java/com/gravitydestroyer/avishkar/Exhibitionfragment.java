package com.gravitydestroyer.avishkar;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Exhibitionfragment extends Fragment {

    private Button mButton;
    private ViewPager mViewPager;

    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;


    public Exhibitionfragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_exhibition, container, false);
        mViewPager = (ViewPager)v.findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.drawable.material, R.string.text_1));
        mCardAdapter.addCardItem(new CardItem(R.drawable.material, R.string.text_2));
        mCardAdapter.addCardItem(new CardItem(R.drawable.material, R.string.text_3));
        mCardAdapter.addCardItem(new CardItem(R.drawable.material, R.string.text_4));

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);


        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        return v;

    }
    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);

    }

}
