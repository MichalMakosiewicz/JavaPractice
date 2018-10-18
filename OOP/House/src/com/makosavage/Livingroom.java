package com.makosavage;

public class Livingroom {

    private Couch couch;
    private TV tv;

    public Livingroom(Couch couch, TV tv) {
        this.couch = couch;
        this.tv = tv;
    }

    public Couch getCouch() {
        return couch;
    }

    public TV getTv() {
        return tv;
    }

    public void setCouch(Couch couch) {
        this.couch = couch;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
