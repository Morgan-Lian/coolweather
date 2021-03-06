package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 等待夏天的蝉 on 2017/12/15.
 */

public class Province extends DataSupport {//省份

    private int id;
    private String provinceName;//省的名字
    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

}
