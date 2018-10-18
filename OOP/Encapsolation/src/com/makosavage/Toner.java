package com.makosavage;

public class Toner {

    private int level;
    private String color;

    public Toner(int level, String color) {
        this.level = level;
        this.color = color;
    }

    public void printed(){
        level--;
    }

    public int getLevel() {
        return level;
    }

    public String getColor() {
        return color;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
