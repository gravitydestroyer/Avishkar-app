package com.gravitydestroyer.aavishkar.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.gravitydestroyer.aavishkar.R;

import static android.Manifest.permission.CALL_PHONE;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12;
    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);

        cb1 = (ImageView) findViewById(R.id.call1);
        cb2 = (ImageView) findViewById(R.id.call2);
        cb3 = (ImageView) findViewById(R.id.call3);
        cb4 = (ImageView) findViewById(R.id.call4);
        cb5 = (ImageView) findViewById(R.id.call5);
        cb6 = (ImageView) findViewById(R.id.call6);
        cb7 = (ImageView) findViewById(R.id.call7);
        cb8 = (ImageView) findViewById(R.id.call8);
        cb9 = (ImageView) findViewById(R.id.call9);
        cb10 = (ImageView) findViewById(R.id.call10);
        cb11 = (ImageView) findViewById(R.id.call11);
        cb12 = (ImageView) findViewById(R.id.call12);

        cb1.setOnClickListener(this);
        cb2.setOnClickListener(this);
        cb3.setOnClickListener(this);
        cb4.setOnClickListener(this);
        cb5.setOnClickListener(this);
        cb6.setOnClickListener(this);
        cb7.setOnClickListener(this);
        cb8.setOnClickListener(this);
        cb9.setOnClickListener(this);
        cb10.setOnClickListener(this);
        cb11.setOnClickListener(this);
        cb12.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.call1:
                Intent cintent1 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+917278270313"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent1);
                break;
            case R.id.call2:
                Intent cintent2 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919064353647"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent2);
                break;
            case R.id.call3:
                Intent cintent3 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919674825450"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent3);
                break;
            case R.id.call4:
                Intent cintent4 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+917063141513"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent4);
                break;
            case R.id.call5:
                Intent cintent5 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+917076316399"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent5);
                break;
            case R.id.call6:
                Intent cintent6 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+918765320081"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent6);
                break;
            case R.id.call7:
                Intent cintent7 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+918967945051"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent7);
                break;
            case R.id.call8:
                Intent cintent8 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919398564364"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent8);
                break;
            case R.id.call9:
                Intent cintent9 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919641407625"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent9);
                break;
            case R.id.call10:
                Intent cintent10 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+917063698718"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent10);
                break;
            case R.id.call11:
                Intent cintent11 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+918603598657"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent11);
                break;
            case R.id.call12:
                Intent cintent12 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919439072479"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(cintent12);
                break;

        }
    }
}

