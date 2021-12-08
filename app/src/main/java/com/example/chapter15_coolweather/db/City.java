package com.example.chapter15_coolweather.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(int id){
        return id;
    }
    public String getCityName(){
     return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
