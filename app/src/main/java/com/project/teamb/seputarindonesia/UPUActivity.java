package com.project.teamb.seputarindonesia;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class UPUActivity extends AppCompatActivity {

    private void tampilwebyt(String url){
        WebView webviewku = (WebView) findViewById(R.id.wbUPU);
        webviewku.loadUrl(url);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_p_u);
        tampilwebyt("https://potensi-utama.ac.id/");
    }
}
