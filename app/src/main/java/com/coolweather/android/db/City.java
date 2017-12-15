package com.coolweather.android.db;

/**
 * Created by 等待夏天的蝉 on 2017/12/15.
 */

public class City {//市

    private int id;
    private String cityName;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//市所属的省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
