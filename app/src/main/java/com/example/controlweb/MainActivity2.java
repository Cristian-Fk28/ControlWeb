package com.example.controlweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {


    WebView WV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WV1 = (WebView) findViewById(R.id.webView);

        WV1.setWebViewClient(new WebViewClient());
        WV1.loadUrl("http://"+URL);
    }

    public void Cerrar(View view) {
        finish();
    }
}