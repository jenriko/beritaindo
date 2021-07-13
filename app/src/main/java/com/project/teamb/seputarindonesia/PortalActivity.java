package com.project.teamb.seputarindonesia;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class PortalActivity extends AppCompatActivity {

    private void tampilwebyt(String url){
        WebView webviewku = (WebView) findViewById(R.id.wbportal);
        webviewku.loadUrl(url);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);
        tampilwebyt("http://portal.potensi-utama.ac.id/");
    }
}