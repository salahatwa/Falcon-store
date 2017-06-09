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
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product-id")
    private long productID;

    private String productName;

    private int quantity;

    private String category;

    private double productPrice;

    private double productDiscountPrice;

    private String description;

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
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
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

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the productDiscountPrice
     */
    public double getProductDiscountPrice() {
        return productDiscountPrice;
    }

    /**
     * @param productDiscountPrice the productDiscountPrice to set
     */
    public void setProductDiscountPrice(double productDiscountPrice) {
        this.productDiscountPrice = productDiscountPrice;
    }
}
