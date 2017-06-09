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
@Table(name = "Countries")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country-id")
    private long countryID;

    private String countryName;

    @OneToMany(fetch = FetchType.EAGER,targetEntity = Governorate.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private List<Governorate> governorates;

    public Country() {
        governorates = new ArrayList<>();
    }

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
     * @return the governorates
     */
    public List<Governorate> getGovernorates() {
        return governorates;
    }

    /**
     * @param governorates the governorates to set
     */
    public void setGovernorates(List<Governorate> governorates) {
        this.governorates = governorates;
    }

}
