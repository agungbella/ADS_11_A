package com.example.dell.ambulance.information;

public class InfoList {
    private String mNamakejadian;
    private String mLokasikejadian;
    private String mTanggalkejadian;
    private int mProfile;

    public InfoList(String vNama, String vKejadian, String vTanggal, int imageResourceId) {
        mNamakejadian = vNama;
        mLokasikejadian = vKejadian;
        mTanggalkejadian = vTanggal;
        mProfile = imageResourceId;
    }

    public String getmNamakejadian() {
        return mNamakejadian;
    }

    public String getmLokasikejadian() {
        return mLokasikejadian;
    }

    public String getmTanggalkejadian() {
        return mTanggalkejadian;
    }

    public int getmProfile() {
        return mProfile;
    }
}


