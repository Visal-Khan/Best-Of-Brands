package com.example.bestofbrandsabbottabad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class One_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);


        WebView webview = (WebView) findViewById(R.id.one_webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://beoneshopone.com/");

        WebSettings webSettings  = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}