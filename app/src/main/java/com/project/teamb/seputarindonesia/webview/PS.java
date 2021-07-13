package com.project.teamb.seputarindonesia.webview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.project.teamb.seputarindonesia.R;

public class PS   extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.webview);
        WebView web = (WebView) findViewById(R.id.webview);
        web.loadUrl("https://potensi-utama.ac.id/page/psikologi-s1");
        web.setWebViewClient(new WebViewClient());
    }
}
