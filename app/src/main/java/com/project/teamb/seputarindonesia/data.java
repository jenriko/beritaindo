package com.project.teamb.seputarindonesia;

import android.os.Parcel;
import android.os.Parcelable;

public class data implements Parcelable {
    private String fakultas;

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    private int logo;

    private String proditik;

    public String getProditik() {
        return proditik;
    }
    public void setProditik(String proditik) {
        this.proditik = proditik;
    }

    public data() {
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fakultas);
        dest.writeString(this.proditik);
    }
    protected data(Parcel in) {
        this.fakultas = in.readString();
        this.proditik = in.readString();
    }

    public static final Creator<data> CREATOR = new Creator<data>() {
        @Override
        public data createFromParcel(Parcel source) {
            return new data(source);
        }

        @Override
        public data[] newArray(int size) {
            return new data[size];
        }
    };
}
