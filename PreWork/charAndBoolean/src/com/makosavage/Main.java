package com.makosavage;

public class Main {

    public static void main(String[] args) {

        double var1 = 20;
        double var2 = 80;

        double sum = (var1+var2)*25;

        double reminder = sum%40;

        if (reminder <= 20)
            System.out.println("everything thine!!!");

        boolean test =true;
        if (test != true) {
            System.out.println("OK");
            System.out.println("OK2");
        }
    }
}
