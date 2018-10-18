package com.makosavage;

public class Table {

    private String size;
    private int legs;

    public Table(String size, int legs) {
        this.size = size;
        this.legs = legs;
    }

    public String getSize() {
        return size;
    }

    public int getLegs() {
        return legs;
    }
}
