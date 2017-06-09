/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.falcon.models;

/**
 *
 * @author salah
 */
public class City {

    private long cityID;
    private String cityName;

    /**
     * @return the cityID
     */
    public long getCityID() {
        return cityID;
    }

    /**
     * @param cityID the cityID to set
     */
    public void setCityID(long cityID) {
        this.cityID = cityID;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
