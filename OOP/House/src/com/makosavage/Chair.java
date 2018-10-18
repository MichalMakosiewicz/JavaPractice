package com.makosavage;

public class Chair {

    private String madeof;
    private String color;

    public Chair(String madeof, String color) {
        this.madeof = madeof;
        this.color = color;
    }

    public String getMadeof() {
        return madeof;
    }

    public String getColor() {
        return color;
    }
}
