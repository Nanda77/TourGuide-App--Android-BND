package com.example.android.tourguide;

/**
 * Created by Nanda on 13/11/16.
 */

public class Place {

    private String mName;
    private String mRank;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Place(String mName, String mRank) {
        this.mName = mName;
        this.mRank = mRank;

    }

    public Place(String mName, String mRank, int mImageResourceID) {
        this.mName = mName;
        this.mRank = mRank;
        this.mImageResourceID = mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public String getmName() {
        return mName;
    }

    public String getmRank() {
        return mRank;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
