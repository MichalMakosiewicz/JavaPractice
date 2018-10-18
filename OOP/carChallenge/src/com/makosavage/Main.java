package com.makosavage;

public class Main {

    public static void main(String[] args) {

        Hyundai i30 = new Hyundai(1,0);

        System.out.println(i30.getSpeed());

        i30.speedUp(20);

        System.out.println(i30.getSpeed());

        i30.speedDown(15);

        System.out.println(i30.getSpeed());

    }
}
