package com.example.marvelapp.model;

public class HeroImage {
    private String extention;
    private String path;
    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        this.path += "."+ extention;

    }
}
