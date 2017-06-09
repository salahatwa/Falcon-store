/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.falcon.models;

import java.util.List;

/**
 *
 * @author salah
 */
public class Country {

    private long countryID;
    private String countryName;

    private List<City> cities;

    /**
     * @return the countryID
     */
    public long getCountryID() {
        return countryID;
    }

    /**
     * @param countryID the countryID to set
     */
    public void setCountryID(long countryID) {
        this.countryID = countryID;
    }

    /**
     * @return the countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName the countryName to set
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * @return the cities
     */
    public List<City> getCities() {
        return cities;
    }

    /**
     * @param cities the cities to set
     */
    public void setCities(List<City> cities) {
        this.cities = cities;
    }

}
