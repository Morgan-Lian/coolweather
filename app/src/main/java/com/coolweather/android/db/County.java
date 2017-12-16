package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 等待夏天的蝉 on 2017/12/15.
 */

public class County extends DataSupport {//县

    private int id;
    private String countyName;//县的名字
    private String weatherId;//县所对应的天气的ID
    private int cityId;//县所属市的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
