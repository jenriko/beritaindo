package com.project.teamb.seputarindonesia;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateFormat;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private final int waktu_loading=4000;

    TextView textView;
    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,
                WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login=new Intent(MainActivity.this, HomeActivity.class);
                startActivity(login);
                finish();

            }
        },waktu_loading);

        textView = findViewById(R.id.version);
        PackageManager pm = getApplicationContext().getPackageManager();
        String pkgName = getApplicationContext().getPackageName();
        PackageInfo pkgInfo = null;
        try {
            pkgInfo = pm.getPackageInfo(pkgName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        String ver = pkgInfo.versionName;
        textView.setText("App Version " +ver);}

}