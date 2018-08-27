package com.makosavage;

public class Main {

    public static void main(String[] args) {

        double kilograms = 23.3d;
        double toPounds = 0.45359237;

        double pounds = 1d;

        System.out.println(kilograms + " pounds is " + (kilograms*toPounds) + " in kilograms.");

        System.out.println(pounds + " in kilograms will be " + (pounds/toPounds) + "pounds.");

    }
}
