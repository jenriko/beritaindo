package com.project.teamb.seputarindonesia.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.project.teamb.seputarindonesia.R;

public class ListAdapter extends ArrayAdapter {

    private String[] Prodi;
    private Context context;

    ListAdapter(@NonNull Context context,  String[] prodi) {
        super(context, R.layout.custom_listview, prodi);

        this.Prodi = prodi;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_listview, null, true);
        TextView prodi = view.findViewById(R.id.text_prodi);


    prodi.setText(Prodi[position]);

        return view;
    }
}
