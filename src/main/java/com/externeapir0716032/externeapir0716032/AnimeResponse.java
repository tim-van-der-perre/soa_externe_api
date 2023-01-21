package com.externeapir0716032.externeapir0716032;

public class AnimeResponse {

    private String title;
    private String description;
    private float price;
    private String type;
    private String picture_url;

    public AnimeResponse(String title, String description, float price, String type, String picture_url) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.type = type;
        this.picture_url = picture_url;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    @Override
    public String toString() {
        return  "{title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", picture_url='" + picture_url + '\'' +
                '}';
    }
}
