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
public class Product {

    private long   productID;
    private String productName;

    private String quantity;
    private String description;

    private String catagory;

    private String pursesPrice;
    private String sellPrice;
    private String discountInCash;
    private String discountInPersent;


    private String storeDate;

    /**
     * @return the productId
     */
    public long getProductId() {
        return productID;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(long productId) {
        this.productID = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the catagory
     */
    public String getCatagory() {
        return catagory;
    }

    /**
     * @param catagory the catagory to set
     */
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    /**
     * @return the pursesPrice
     */
    public String getPursesPrice() {
        return pursesPrice;
    }

    /**
     * @param pursesPrice the pursesPrice to set
     */
    public void setPursesPrice(String pursesPrice) {
        this.pursesPrice = pursesPrice;
    }

    /**
     * @return the sellPrice
     */
    public String getSellPrice() {
        return sellPrice;
    }

    /**
     * @param sellPrice the sellPrice to set
     */
    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * @return the discountInCash
     */
    public String getDiscountInCash() {
        return discountInCash;
    }

    /**
     * @param discountInCash the discountInCash to set
     */
    public void setDiscountInCash(String discountInCash) {
        this.discountInCash = discountInCash;
    }

    /**
     * @return the discountInPersent
     */
    public String getDiscountInPersent() {
        return discountInPersent;
    }

    /**
     * @param discountInPersent the discountInPersent to set
     */
    public void setDiscountInPersent(String discountInPersent) {
        this.discountInPersent = discountInPersent;
    }

    

    /**
     * @return the storeDate
     */
    public String getStoreDate() {
        return storeDate;
    }

    /**
     * @param storeDate the storeDate to set
     */
    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }
}
