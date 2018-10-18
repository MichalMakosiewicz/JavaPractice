package com.makosavage;

public class Bathroom {

    private Tub tub;
    private Toilet toilet;

    public Bathroom(Tub tub, Toilet toilet) {
        this.tub = tub;
        this.toilet = toilet;
    }

    public Tub getTub() {
        return tub;
    }

    public Toilet getToilet() {
        return toilet;
    }
}
