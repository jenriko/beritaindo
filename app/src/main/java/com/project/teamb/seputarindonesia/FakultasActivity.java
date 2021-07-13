package com.project.teamb.seputarindonesia;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.teamb.seputarindonesia.Adpter.DataAdapter;

import java.util.ArrayList;

public class FakultasActivity extends AppCompatActivity implements View.OnClickListener{
    private String[] dataFakultas;
    private TypedArray dataLogo;
    private DataAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakultas);

        adapter = new DataAdapter(this);
        ListView listView = findViewById(R.id.lv_fakultas);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent moveWithObject = new Intent(FakultasActivity.this, ProdiActivity.class);

                ArrayList<data> users = new ArrayList<data>();

                data Data = new data();
               Data.setLogo(dataLogo.getResourceId(i, -1));
                Data.setFakultas(dataFakultas[i]);


             users.add(Data);

                users.add(Data);
                moveWithObject.putParcelableArrayListExtra(ProdiActivity.EXTRA_USER, users);
                moveWithObject.putExtra(ProdiActivity.EXTRA_USER, Data);
                startActivity(moveWithObject);

            }
        });
    }

    @Override
    public void onClick(View v) {
        //
    }

    private void addItem() {

        ArrayList<data> users = new ArrayList<>();

        for (int i = 0; i < dataFakultas.length; i++) {
       data Data = new data();
            Data.setLogo(dataLogo.getResourceId(i, -1));
           Data.setFakultas(dataFakultas[i]);
            users.add(Data);
        }
        adapter.setUsers(users);
    }

    private void prepare() {
        dataFakultas = getResources().getStringArray(R.array.data_fakultas);
        dataLogo = getResources().obtainTypedArray(R.array.data_logo);

    }
}