package com.project.teamb.seputarindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.project.teamb.seputarindonesia.webview.AK;
import com.project.teamb.seputarindonesia.webview.DI;
import com.project.teamb.seputarindonesia.webview.DKV;
import com.project.teamb.seputarindonesia.webview.ES;
import com.project.teamb.seputarindonesia.webview.FT;
import com.project.teamb.seputarindonesia.webview.HI;
import com.project.teamb.seputarindonesia.webview.HK;
import com.project.teamb.seputarindonesia.webview.MA;
import com.project.teamb.seputarindonesia.webview.MI;
import com.project.teamb.seputarindonesia.webview.PBI;
import com.project.teamb.seputarindonesia.webview.PERBANKAN;
import com.project.teamb.seputarindonesia.webview.PS;
import com.project.teamb.seputarindonesia.webview.RPL;
import com.project.teamb.seputarindonesia.webview.RSK;
import com.project.teamb.seputarindonesia.webview.SI;
import com.project.teamb.seputarindonesia.webview.TI;
import com.project.teamb.seputarindonesia.webview.TIF;

public class ProdiActivity extends AppCompatActivity {
  public static final String EXTRA_USER = "test_extra_user";
  ListView lv;
  String[] Prodi={
          "Teknik Informatika", "Sistem Informasi", "Teknik Industri", "Manajemen Informasi (D3)", "Rekayasa Perangkat Lunak", "Rekayasa Sistem Komputer",
          "Desain Interior", "Film dan Televisi", "Desain Komunikasi Visual", "Psikologi", "Pendidikan Bahasa Inggris", "Hubungan Intenasional", "Hukum", "Perbankan Syariah",
          "Ekonomi Syariah", "Manajemen", "Akuntansi"
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_prodi);

    lv = findViewById(R.id.listview);

    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Prodi);
    lv.setAdapter(adapter);
    lv.setOnItemClickListener((parent, view, position, id) -> {

      if (position == 0) {
        Intent intent = new Intent(view.getContext(), TIF.class);
        startActivityForResult(intent, 0);
      }


      if (position == 1) {
        Intent intent = new Intent(view.getContext(), SI.class);
        startActivityForResult(intent, 0);
      }
      if (position == 2) {
        Intent intent = new Intent(view.getContext(), TI.class);
        startActivityForResult(intent, 0);
      }
      if (position == 3) {
        Intent intent = new Intent(view.getContext(), MI.class);
        startActivityForResult(intent, 0);
      }
      if (position == 4) {
        Intent intent = new Intent(view.getContext(), RPL.class);
        startActivityForResult(intent, 0);
      }
      if (position == 5) {
        Intent intent = new Intent(view.getContext(), RSK.class);
        startActivityForResult(intent, 0);
      }
      if (position == 6) {
        Intent intent = new Intent(view.getContext(), DI.class);
        startActivityForResult(intent, 0);
      }
      if (position == 7) {
        Intent intent = new Intent(view.getContext(), FT.class);
        startActivityForResult(intent, 0);
      }
      if (position == 8) {
        Intent intent = new Intent(view.getContext(), DKV.class);
        startActivityForResult(intent, 0);
      }
      if (position == 9) {
        Intent intent = new Intent(view.getContext(), PS.class);
        startActivityForResult(intent, 0);
      }
      if (position == 10) {
        Intent intent = new Intent(view.getContext(), PBI.class);
        startActivityForResult(intent, 0);
      }
      if (position == 11) {
        Intent intent = new Intent(view.getContext(), HI.class);
        startActivityForResult(intent, 0);
      }
      if (position == 12) {
        Intent intent = new Intent(view.getContext(), HK.class);
        startActivityForResult(intent, 0);
      }
      if (position == 13) {
        Intent intent = new Intent(view.getContext(), PERBANKAN.class);
        startActivityForResult(intent, 0);
      }
      if (position == 14) {
        Intent intent = new Intent(view.getContext(), ES.class);
        startActivityForResult(intent, 0);
      }
      if (position == 15) {
        Intent intent = new Intent(view.getContext(), MA.class);
        startActivityForResult(intent, 0);
      }
      if (position == 16) {
        Intent intent = new Intent(view.getContext(), AK.class);
        startActivityForResult(intent, 0);
      }


      Toast.makeText(getApplicationContext(),
              "Kamu Memilih: " + Prodi[position],
              Toast.LENGTH_SHORT).show();

    });
  }

}
