package com.project.teamb.seputarindonesia.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.teamb.seputarindonesia.R;
import com.project.teamb.seputarindonesia.data;

import java.util.ArrayList;

public class DataAdapter  extends BaseAdapter {
    private Context context;
    private ArrayList<data> Data;

    public void setUsers(ArrayList<data> users) {
        this.Data = users;
    }

    public DataAdapter(Context context) {
        this.context = context;
       Data = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Object getItem(int i) {
        return Data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        data data = (data) getItem(i);
        viewHolder.bind(data);
        return view;

    }

    private class ViewHolder {
        private TextView tv_Fakultas;
        private ImageView imgLogo;

        ViewHolder(View view) {
            tv_Fakultas = view.findViewById(R.id.tv_fakultas);
            imgLogo = view.findViewById(R.id.logo);

        }

        void bind(data Data) {
            tv_Fakultas.setText(Data.getFakultas());
            imgLogo.setImageResource(Data.getLogo());


        }
    }
}
