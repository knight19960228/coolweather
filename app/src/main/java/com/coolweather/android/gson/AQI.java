package com.coolweather.android.gson;

/**
 * Created by 陈泉基 on 2017-12-07.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
