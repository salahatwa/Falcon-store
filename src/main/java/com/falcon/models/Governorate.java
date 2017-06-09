/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.falcon.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author salah
 */
@Entity
@Table(name = "Governorates")
public class Governorate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "governorate-id")
    private long governorateID;

    private String governorateName;

    @OneToMany(fetch = FetchType.EAGER,targetEntity = City.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private List<City> cities;

    public Governorate() {
        cities = new ArrayList<>();
    }

    /**
     * @return the governorateID
     */
    public long getGovernorateID() {
        return governorateID;
    }

    /**
     * @param governorateID the governorateID to set
     */
    public void setGovernorateID(long governorateID) {
        this.governorateID = governorateID;
    }

    /**
     * @return the governorateName
     */
    public String getGovernorateName() {
        return governorateName;
    }

    /**
     * @param governorateName the governorateName to set
     */
    public void setGovernorateName(String governorateName) {
        this.governorateName = governorateName;
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
