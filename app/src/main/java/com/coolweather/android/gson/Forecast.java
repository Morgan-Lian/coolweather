package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 等待夏天的蝉 on 2017/12/17.
 */

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;

    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
