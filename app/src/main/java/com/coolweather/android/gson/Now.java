package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 陈泉基 on 2017-12-07.
 */

public class Now {
    @SerializedName("tem")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
