package com.example.marvelapp.model;

public class Hero {
    private String name;
    private String url;
    private HeroImage image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HeroImage getImage() {
        return image;
    }

    public void setData(HeroImage image) {
        this.image = image;
    }
}