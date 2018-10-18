package com.makosavage;

public class Hyundai extends Car {

    private int speed;
    private  String paint;

    public Hyundai(int gear, int speed) {
        super(true, "1.6", 0, 800, 4, 8, "diesel", gear);
        this.speed = speed;
        this.paint = "Grey";
    }

    public void speedUp(int ammount){
        this.speed+=ammount;
    }

    public void speedDown(int ammount){
        this.speed-=ammount;
    }


    public int getSpeed() {
        return speed;
    }

}
