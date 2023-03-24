package com.CTF.ip_check_app;

import static android.content.ContentValues.TAG;

import static com.CTF.ip_check_app.DeviceInfoUtil.getDeviceBrand;
import static com.CTF.ip_check_app.DeviceInfoUtil.getDeviceId;
import static com.CTF.ip_check_app.DeviceInfoUtil.getDeviceModel;
import static com.CTF.ip_check_app.DeviceInfoUtil.getDeviceOs;
import static com.CTF.ip_check_app.DeviceInfoUtil.getDeviceSdk;
import static com.CTF.ip_check_app.DeviceInfoUtil.getManufacturer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
    private Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Log.d(TAG, "--- getDeviceId : "+getDeviceId(context));  //device id
        Log.d(TAG, "--- getManufacturer : "+getManufacturer());  //제조사
//        Log.d(TAG, "--- getDeviceBrand : "+getDeviceBrand());  //브랜드
//        Log.d(TAG, "--- getDeviceModel : "+getDeviceModel());  //모델명
//        Log.d(TAG, "--- getDeviceOs : "+getDeviceOs());  //안드로이드 OS 버전
//        Log.d(TAG, "--- getDeviceSdk : "+getDeviceSdk());  //안드로이드 SDK 버전
        if(getManufacturer()=="Smart_Safe_Mobile"){


        }


    }




}