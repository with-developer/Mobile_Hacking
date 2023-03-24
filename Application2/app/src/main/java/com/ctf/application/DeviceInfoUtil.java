package com.ctf.application;

import android.os.Build;

public class DeviceInfoUtil {

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

}