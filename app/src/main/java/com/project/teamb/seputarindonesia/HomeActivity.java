package com.project.teamb.seputarindonesia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;

import java.util.Calendar;
import java.util.Date;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
        MaterialCardView cvHome, cvTambahan, cvFakultas, cvProdi, cvPortal, cvUPU;
        TextView tvToday;
        String hariIni;
        DrawerLayout drawerLayout;
        NavigationView navigationView;
        Toolbar toolbar;
@SuppressLint("WrongViewCast")
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);

        cvHome= findViewById(R.id.cardMenuUtama);
        cvTambahan = findViewById(R.id.cardTambahan);
        cvFakultas = findViewById(R.id.cardFakultas);
        cvProdi = findViewById(R.id.cardProgramStudi);
        cvPortal = findViewById(R.id.cardPortal);
        cvUPU = findViewById(R.id.cardUPU);

        cvHome.setOnClickListener(this);
        cvTambahan.setOnClickListener(this);
        cvFakultas.setOnClickListener(this);
        cvProdi.setOnClickListener(this);
        cvPortal.setOnClickListener(this);
        cvUPU.setOnClickListener(this);

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

        @Override
        public void onBackPressed() {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                        drawerLayout.closeDrawer(GravityCompat.START);
                } else {

                        super.onBackPressed();
                }
        }

        public void setSupportActionBar(Toolbar toolbar) {
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
        if (v.getId() == R.id.cardMenuUtama) {
        Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
        startActivity(intent);
        } else if (v.getId() == R.id.cardTambahan) {
        Intent intent = new Intent(HomeActivity.this, TambahanActivity.class);
        startActivity(intent);
        } else if (v.getId() == R.id.cardFakultas) {
        Intent intent = new Intent(HomeActivity.this, FakultasActivity.class);
        startActivity(intent);
        } else if (v.getId() == R.id.cardProgramStudi) {
        Intent intent = new Intent(HomeActivity.this, ProdiActivity.class);
        startActivity(intent);
        } else if (v.getId() == R.id.cardPortal) {
        Intent intent = new Intent(HomeActivity.this, PortalActivity.class);
        startActivity(intent);
        } else if (v.getId() == R.id.cardUPU) {
        Intent intent = new Intent(HomeActivity.this, UPUActivity.class);
        startActivity(intent);
        }
        }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                        case R.id.nav_home:
                                Intent intent = new Intent(HomeActivity.this,HomeActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_tambahan:
                                intent = new Intent(HomeActivity.this, TambahanActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_fakultas:
                                intent = new Intent(HomeActivity.this, FakultasActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_prodi:
                                intent = new Intent(HomeActivity.this, ProdiActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_portal:
                                intent = new Intent(HomeActivity.this, PortalActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_potensi:
                                intent = new Intent(HomeActivity.this, UPUActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_headlines:
                                intent = new Intent(HomeActivity.this, HeadLineActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_sport:
                                intent = new Intent(HomeActivity.this, BeritaOlahragaActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_teknology:
                                intent = new Intent(HomeActivity.this, BeritaTeknologiActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_business:
                                intent = new Intent(HomeActivity.this, BeritaBisnisActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_health:
                                intent = new Intent(HomeActivity.this, BeritaKesehatanActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_entertainmnet:
                                intent = new Intent(HomeActivity.this, EntertaimentActivity.class);
                                startActivity(intent);
                                break;
                        case R.id.nav_about:
                                intent = new Intent(HomeActivity.this, AboutActivity.class);
                                startActivity(intent);



                }
                return true;
        }
}