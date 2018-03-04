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
    ImageView fb1, fb2, fb3, fb4, fb5, fb6, fb7, fb8, fb9, fb10, fb11, fb12;
    ImageView wb1, wb2, wb3, wb4, wb5, wb6, wb7, wb8, wb9, wb10, wb11, wb12;
    private static final int REQUEST_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts2);

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

        wb1 = (ImageView) findViewById(R.id.wb1);
        wb2 = (ImageView) findViewById(R.id.wb2);
        wb3 = (ImageView) findViewById(R.id.wb3);
        wb4 = (ImageView) findViewById(R.id.wb4);
        wb5 = (ImageView) findViewById(R.id.wb5);
        wb6 = (ImageView) findViewById(R.id.wb6);
        wb7 = (ImageView) findViewById(R.id.wb7);
        wb8 = (ImageView) findViewById(R.id.wb8);
        wb9 = (ImageView) findViewById(R.id.wb9);
        wb10 = (ImageView) findViewById(R.id.wb10);
        wb11 = (ImageView) findViewById(R.id.wb11);
        wb12 = (ImageView) findViewById(R.id.wb12);


        fb1 = (ImageView) findViewById(R.id.fb1);
        fb2 = (ImageView) findViewById(R.id.fb2);
        fb3 = (ImageView) findViewById(R.id.fb3);
        fb4 = (ImageView) findViewById(R.id.fb4);
        fb5 = (ImageView) findViewById(R.id.fb5);
        fb6 = (ImageView) findViewById(R.id.fb6);
        fb7 = (ImageView) findViewById(R.id.fb7);
        fb8 = (ImageView) findViewById(R.id.fb8);
        fb9 = (ImageView) findViewById(R.id.fb9);
        fb10 = (ImageView) findViewById(R.id.fb10);
        fb11 = (ImageView) findViewById(R.id.fb11);
        fb12 = (ImageView) findViewById(R.id.fb12);



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

        wb1.setOnClickListener(this);
        wb2.setOnClickListener(this);
        wb3.setOnClickListener(this);
        wb4.setOnClickListener(this);
        wb5.setOnClickListener(this);
        wb6.setOnClickListener(this);
        wb7.setOnClickListener(this);
        wb8.setOnClickListener(this);
        wb9.setOnClickListener(this);
        wb10.setOnClickListener(this);
        wb11.setOnClickListener(this);
        wb12.setOnClickListener(this);

        fb1.setOnClickListener(this);
        fb2.setOnClickListener(this);
        fb3.setOnClickListener(this);
        fb4.setOnClickListener(this);
        fb5.setOnClickListener(this);
        fb6.setOnClickListener(this);
        fb7.setOnClickListener(this);
        fb8.setOnClickListener(this);
        fb9.setOnClickListener(this);
        fb10.setOnClickListener(this);
        fb11.setOnClickListener(this);
        fb12.setOnClickListener(this);


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

            case R.id.wb1:
                Intent wintent1 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+917278270313"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent1);
                break;
            case R.id.wb2:
                Intent wintent2 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+919064353647"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent2);
                break;
            case R.id.wb3:
                Intent wintent3 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+919674825450"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent3);
                break;
            case R.id.wb4:
                Intent wintent4 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+917063141513"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent4);
                break;
            case R.id.wb5:
                Intent wintent5 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+917076316399"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent5);
                break;
            case R.id.wb6:
                Intent wintent6 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+918765320081"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent6);
                break;
            case R.id.wb7:
                Intent wintent7 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+918967945051"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent7);
                break;
            case R.id.wb8:
                Intent wintent8 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+919398564364"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent8);
                break;
            case R.id.wb9:
                Intent wintent9 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+919641407625"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent9);
                break;
            case R.id.wb10:
                Intent wintent10 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+917063698718"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent10);
                break;
            case R.id.wb11:
                Intent wintent11 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+918603598657"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent11);
                break;
            case R.id.wb12:
                Intent wintent12 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+919439072479"));

                if (ActivityCompat.checkSelfPermission(this, CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                startActivity(wintent12);
                break;

            case R.id.fb1:
                Intent fintent1 = new Intent();
                fintent1.setAction(Intent.ACTION_VIEW);
                fintent1.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent1.setData(Uri.parse("https://m.facebook.com/profile.php?id=100002688995876&ref=content_filter"));
                startActivity(fintent1);

                break;
            case R.id.fb2:
                Intent fintent2 = new Intent();
                fintent2.setAction(Intent.ACTION_VIEW);
                fintent2.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent2.setData(Uri.parse("https://m.facebook.com/anuj.maurya.180"));
                startActivity(fintent2);

                break;
            case R.id.fb3:
                Intent fintent3 = new Intent();
                fintent3.setAction(Intent.ACTION_VIEW);
                fintent3.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent3.setData(Uri.parse("https://m.facebook.com/profile.php?id=100004468268505&ref=content_filter"));
                startActivity(fintent3);

                break;
            case R.id.fb4:
                Intent fintent4 = new Intent();
                fintent4.setAction(Intent.ACTION_VIEW);
                fintent4.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent4.setData(Uri.parse("https://m.facebook.com/sinha23"));
                startActivity(fintent4);

                break;
            case R.id.fb5:
                Intent fintent5 = new Intent();
                fintent5.setAction(Intent.ACTION_VIEW);
                fintent5.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent5.setData(Uri.parse("https://www.facebook.com/nxtbig"));
                startActivity(fintent5);

                break;
            case R.id.fb6:
                Intent fintent6 = new Intent();
                fintent6.setAction(Intent.ACTION_VIEW);
                fintent6.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent6.setData(Uri.parse("https://m.facebook.com/shubham600937"));
                startActivity(fintent6);

                break;
            case R.id.fb7:
                Intent fintent7 = new Intent();
                fintent7.setAction(Intent.ACTION_VIEW);
                fintent7.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent7.setData(Uri.parse("https://m.facebook.com/punit.drolia"));
                startActivity(fintent7);

                break;
            case R.id.fb8:
                Intent fintent8 = new Intent();
                fintent8.setAction(Intent.ACTION_VIEW);
                fintent8.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent8.setData(Uri.parse("https://m.facebook.com/kovvuri.vikram"));
                startActivity(fintent8);

                break;
            case R.id.fb9:
                Intent fintent9 = new Intent();
                fintent9.setAction(Intent.ACTION_VIEW);
                fintent9.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent9.setData(Uri.parse("https://m.facebook.com/profile.php?id=100002510282004&ref=content_filter"));
                startActivity(fintent9);

                break;
            case R.id.fb10:
                Intent fintent10 = new Intent();
                fintent10.setAction(Intent.ACTION_VIEW);
                fintent10.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent10.setData(Uri.parse("https://m.facebook.com/satyaarvind"));
                startActivity(fintent10);

                break;
            case R.id.fb11:
                Intent fintent11 = new Intent();
                fintent11.setAction(Intent.ACTION_VIEW);
                fintent11.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent11.setData(Uri.parse("https://m.facebook.com/profile.php?id=100005207954302&ref=content_filter"));
                startActivity(fintent11);

                break;
            case R.id.fb12:
                Intent fintent12 = new Intent();
                fintent12.setAction(Intent.ACTION_VIEW);
                fintent12.addCategory(Intent.CATEGORY_BROWSABLE);
                fintent12.setData(Uri.parse("https://m.facebook.com/profile.php?id=100011772971308"));
                startActivity(fintent12);

                break;





        }
    }
}

