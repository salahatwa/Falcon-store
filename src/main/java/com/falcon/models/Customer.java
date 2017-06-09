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
public class Customer {

    private long customerID;
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private Country country;
    private City city;
    private Specialty specialty;
    private Category category;
    private String signUpDate;

    /**
     * @return the customerID
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerPhone
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * @param customerPhone the customerPhone to set
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * @return the customerAddress
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * @param customerAddress the customerAddress to set
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return the specialty
     */
    public Specialty getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the signUpDate
     */
    public String getSignUpDate() {
        return signUpDate;
    }

    /**
     * @param signUpDate the signUpDate to set
     */
    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

}
