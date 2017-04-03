package com.ver2point0.android.anchoragetours.Models;

public class Location {

    private String mName;
    private String mDescrip;
    private String mAddress;
    private String mHours;
    private String mNumber;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Location(int imageResourceId, String name, String descrip, String address, String hours, String number) {
        this.mImageResourceId = imageResourceId;
        this.mName = name;
        this.mDescrip = descrip;
        this.mAddress = address;
        this.mHours = hours;
        this.mNumber = number;
    }

    public String getName() {
        return mName;
    }

    public String getDescrip() {
        return mDescrip;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getNumber() {
        return mNumber;
    }

    public String getHours() {
        return mHours;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
