package com.example.dell.ambulance.ambulance;

public class AmbulanceList {
    private String mNama;
    private String mTarif;
    private String mAlamat;
    private int mProfile;

    public AmbulanceList(String vNama, String vTarif, String vAlamat, int imageResourceId) {
        mNama = vNama;
        mTarif = vTarif;
        mAlamat = vAlamat;
        mProfile = imageResourceId;
    }

    public String getmTarif() {
        return mTarif;
    }

    public int getmProfile() {
        return mProfile;
    }

    public String getmNama() {
        return mNama;

    }

    public String getmAlamat() {
        return mAlamat;

    }


}
