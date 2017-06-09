/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.falcon.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author salah
 */
@Entity
@Table(name = "Specialties")
public class Specialty implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "specialty-id")
    private long specialtyID;

    private String specialtyName;

    /**
     * @return the specialtyID
     */
    public long getSpecialtyID() {
        return specialtyID;
    }

    /**
     * @param specialtyID the specialtyID to set
     */
    public void setSpecialtyID(long specialtyID) {
        this.specialtyID = specialtyID;
    }

    /**
     * @return the specialtyName
     */
    public String getSpecialtyName() {
        return specialtyName;
    }

    /**
     * @param specialtyName the specialtyName to set
     */
    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

}
