package com.sptechnosoft.calclib;

/**
 * Created by SP Technosoft on 2/8/2018.
 */

public class Point {
    float mLatitude;
    float mLongitude;

    public Point(float latitude, float longitude) {
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public float getLongitude() {
        return mLongitude;
    }
}