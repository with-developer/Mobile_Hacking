package com.ctf.application;

import static com.ctf.application.DeviceInfoUtil.getManufacturer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
    private Context context = MainActivity.this;
    String url = "https://drive.google.com/file/d/1wrrFlKtDrcvj5cQ4P4uBfofPjs3j8Do5/view?usp=sharing";
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "--- getManufacturer : "+getManufacturer());  //제조사

        if(getManufacturer().equals("Smart_Security_Mobile")){
            webView = (WebView) findViewById(R.id.webview);

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }

            });
            webView.loadUrl(url);
            Log.d(TAG, "--- started webView : ");
        }


    }
}