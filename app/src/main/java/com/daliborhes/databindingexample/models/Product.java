package com.daliborhes.databindingexample.models;

import java.math.BigDecimal;

/**
 * Created by Dalibor J. Stanković on 18.06.2019.
 */

public class Product {

    private String title;
    private String description;
    private int image;
    private String imageUrl;
    private String price;
    private int serialNumber;

    public Product() {
    }

    public Product(String title, String description, int image, String imageUrl, String price, int serialNumber) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.imageUrl = imageUrl;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
