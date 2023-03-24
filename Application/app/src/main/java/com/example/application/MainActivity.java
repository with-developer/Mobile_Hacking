package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private Cursor cursor;
ImageView imageView;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.picture);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
    }

    public void displayFirstImage(View v) {
        Toast.makeText(getApplicationContext(), "displayFirstImage()", Toast.LENGTH_LONG).show();
        try {
            String[] projection = new String[]{
                    MediaStore.Images.ImageColumns._ID,
                    MediaStore.Images.ImageColumns.DATA
            };
            cursor = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, null, null, null);

            int size = cursor.getCount();
            if (size == 0) {
                Toast.makeText(getApplicationContext(), "장치에 이미지가 없음!", Toast.LENGTH_LONG).show();

            } else {
                if (cursor.moveToFirst()) {
                    String imageLocation = cursor.getString(1);
                    Toast.makeText(getApplicationContext(), imageLocation, Toast.LENGTH_LONG).show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}



