package com.makosavage;

import java.util.Scanner;

public class Printer {

    private Toner redToner;
    private Toner greenToner;
    private  Toner blueToner;
    private Spreedsheets spreedsheets;
    private int spreedsheetPrinted;

    public Printer(Toner redToner, Toner greenToner, Toner blueToner, Spreedsheets spreedsheets) {
        this.redToner = redToner;
        this.greenToner = greenToner;
        this.blueToner = blueToner;
        this.spreedsheets = spreedsheets;
        this.spreedsheetPrinted = 0;
    }

    public void setSpreedsheets(Spreedsheets spreedsheets) {
        this.spreedsheets = spreedsheets;
    }

    public void print(int pages){
        Scanner scanner = new Scanner(System.in);
        System.out.println("On bouth sides? (1/0): ");
        int decision = scanner.nextInt();
        scanner.close();

        if (decision==1){
            pages=pages/2;
            System.out.println(pages);
        }

        if (spreedsheets.getAmmount()>=pages){
            spreedsheets.setAmmount(spreedsheets.getAmmount()-pages);
            spreedsheetPrinted+=pages;
            System.out.println(pages+" was printed.");
            greenToner.printed();
            blueToner.printed();
            redToner.printed();
        }else {
            System.out.println("Out of paper! You got: " + spreedsheets.getAmmount());
        }

    }

    public void tonerReplace(){
        blueToner.setLevel(100);
        greenToner.setLevel(100);
        redToner.setLevel(100);
        System.out.println("Toners has been replaced!");
    }

    public void addSheets(int amm){
        spreedsheets.setAmmount(spreedsheets.getAmmount()+amm);
    }

    public Toner getRedToner() {
        return redToner;
    }

    public Toner getGreenToner() {
        return greenToner;
    }

    public Toner getBlueToner() {
        return blueToner;
    }

    public Spreedsheets getSpreedsheets() {
        return spreedsheets;
    }

    public int getSpreedsheetPrinted() {
        return spreedsheetPrinted;
    }


}
