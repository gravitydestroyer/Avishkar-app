package com.gravitydestroyer.aavishkar;

/**
 * Created by gravitydestroyer on 01/03/18.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Display details for a given kitten
 *
 * @author bherbst
 */
public class DetailsFragment extends android.support.v4.app.Fragment {
    private static final String ARG_KITTEN_NUMBER = "argKittenNumber";

    /**
     * Create a new DetailsFragment
     * @param kittenNumber The number (between 1 and 4) of the kitten to display
     */
    public static DetailsFragment newInstance(@IntRange(from = 1, to = 3) int kittenNumber) {
        Bundle args = new Bundle();
        args.putInt(ARG_KITTEN_NUMBER, kittenNumber);

        DetailsFragment fragment = new DetailsFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.details_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView text_head=(TextView) view.findViewById(R.id.text_head);
        TextView text_body=(TextView) view.findViewById(R.id.text_body);
        Button call_button=(Button) view.findViewById(R.id.call_button);

        Bundle args = getArguments();
        int kittenNumber = args.containsKey(ARG_KITTEN_NUMBER) ? args.getInt(ARG_KITTEN_NUMBER) : 1;

        switch (kittenNumber) {

            case 1:
                image.setImageResource(R.drawable.analyt);
                text_head.setText("Data Analytics");
                text_body.setText("‘Sophia’ is taking over quite literally. The world’s entering the robotic age very rapidly. From serving as waiters in restaurants to solving the toughest of mathematical problems in research centres, robots are slowly taking over everything. Doesn’t this fascinate you as well ? It does fascinate us, honestly. \n" +
                                "This Aavishkar, come attend the workshop on “Data analytics” and learn how to build a voice controlled robot, among many other things. \n" +
                                "“I’m a line following robot” isn’t a dream anymore.");

                call_button.setText("Contact Sahil Jaiswal");

                call_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentcall = new Intent();
                        intentcall.setAction(Intent.ACTION_DIAL);
                        String phonenumber="+918274916172";
                        intentcall.setData(Uri.parse("tel:" + phonenumber)); // set the Uri
                        startActivity(intentcall);
                    }
                });
                break;
            case 2:
                image.setImageResource(R.drawable.ethhck);
                text_head.setText("Ethical Hacking");
                text_body.setText("Ethical hacking has always been a field of interest for many. Realising how a person from a remote location could actually take complete control over your machine or understanding the way click-based webpage viruses  work, could really help you tackle them or maybe even infest your best friend’s machine with one of those. :p\n" +
                        "This Aavishkar learn all of hacking and machine security in the workshop on “___”. Here you will be taught everything from networking to google and email hacking to cryptography. Everything will be taught from scratch so anyone can attend the workshop irrespective of year or degree or branch.");

                call_button.setText("Contact Sahil Jaiswal");

                call_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentcall = new Intent();
                        intentcall.setAction(Intent.ACTION_DIAL);
                        String phonenumber="+918274916172";
                        intentcall.setData(Uri.parse("tel:" + phonenumber)); // set the Uri
                        startActivity(intentcall);
                    }
                });
                break;
            case 3:
                image.setImageResource(R.drawable.gesture);
                text_head.setText("Gesture Controlled Robotics");
                text_body.setText("Gone are the days when Raspberry pi reminded you of dessert and Arduinos were considered just another fad. Installing code on those advanced microprocessor chips and using it to run the self-made machine is quite an interesting thing to do , making quite a buzz these days. What if we told you that you could do all of this, and learn other advanced stuff too. This Aavishkar come enter the world of arduino.");

                call_button.setText("Contact Sahil Jaiswal");


                call_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentcall = new Intent();
                        intentcall.setAction(Intent.ACTION_DIAL);
                        String phonenumber="+918274916172";
                        intentcall.setData(Uri.parse("tel:" + phonenumber)); // set the Uri
                        startActivity(intentcall);
                    }
                });
                break;

        }
    }
}