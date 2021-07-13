package com.project.teamb.seputarindonesia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

import java.util.Calendar;
import java.util.Date;

public class TambahanActivity extends AppCompatActivity implements View.OnClickListener{
    MaterialCardView cvHead, cvSports, cvTechno, cvBusiness, cvHealth, cvEntertaiment;
    TextView tvToday;
    String hariIni;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahan);


        cvHead = findViewById(R.id.cardHeadLine);
        cvSports = findViewById(R.id.cardOlahraga);
        cvTechno = findViewById(R.id.cardTeknologi);
        cvBusiness = findViewById(R.id.cardBisnis);
        cvHealth = findViewById(R.id.cardKesehatan);
        cvEntertaiment = findViewById(R.id.cardHiburan);

        cvHead.setOnClickListener(this);
        cvSports.setOnClickListener(this);
        cvTechno.setOnClickListener(this);
        cvBusiness.setOnClickListener(this);
        cvHealth.setOnClickListener(this);
        cvEntertaiment.setOnClickListener(this);

        tvToday = findViewById(R.id.tvDate);
        Date dateNow = Calendar.getInstance().getTime();
        hariIni = (String) DateFormat.format("EEEE", dateNow);
        if (hariIni.equalsIgnoreCase("sunday")) {
            hariIni = "Minggu";
        } else if (hariIni.equalsIgnoreCase("monday")) {
            hariIni = "Senin";
        } else if (hariIni.equalsIgnoreCase("tuesday")) {
            hariIni = "Selasa";
        } else if (hariIni.equalsIgnoreCase("wednesday")) {
            hariIni = "Rabu";
        } else if (hariIni.equalsIgnoreCase("thursday")) {
            hariIni = "Kamis";
        } else if (hariIni.equalsIgnoreCase("friday")) {
            hariIni = "Jumat";
        } else if (hariIni.equalsIgnoreCase("saturday")) {
            hariIni = "Sabtu";
        }

        getToday();

    }



    private void getToday() {
        Date date = Calendar.getInstance().getTime();
        String tanggal = (String) DateFormat.format("d", date);
        String monthNumber = (String) DateFormat.format("M", date);
        String year = (String) DateFormat.format("yyyy", date);

        int month = Integer.parseInt(monthNumber);
        String bulan = null;
        if (month == 1) {
            bulan = "Januari";
        } else if (month == 2) {
            bulan = "Februari";
        } else if (month == 3) {
            bulan = "Maret";
        } else if (month == 4) {
            bulan = "April";
        } else if (month == 5) {
            bulan = "Mei";
        } else if (month == 6) {
            bulan = "Juni";
        } else if (month == 7) {
            bulan = "Juli";
        } else if (month == 8) {
            bulan = "Agustus";
        } else if (month == 9) {
            bulan = "September";
        } else if (month == 10) {
            bulan = "Oktober";
        } else if (month == 11) {
            bulan = "November";
        } else if (month == 12) {
            bulan = "Desember";
        }
        String formatFix = hariIni + ", " + tanggal + " " + bulan + " " + year;
        tvToday.setText(formatFix);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cardHeadLine) {
            Intent intent = new Intent(TambahanActivity.this, HeadLineActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.cardOlahraga) {
            Intent intent = new Intent(TambahanActivity.this, BeritaOlahragaActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.cardTeknologi) {
            Intent intent = new Intent(TambahanActivity.this, BeritaTeknologiActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.cardBisnis) {
            Intent intent = new Intent(TambahanActivity.this, BeritaBisnisActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.cardKesehatan) {
            Intent intent = new Intent(TambahanActivity.this, BeritaKesehatanActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.cardHiburan) {
            Intent intent = new Intent(TambahanActivity.this, EntertaimentActivity.class);
            startActivity(intent);
        }
    }

}