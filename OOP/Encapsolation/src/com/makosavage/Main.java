package com.makosavage;

public class Main {

    public static void main(String[] args) {

        Toner redToner = new Toner(100, "Red");
        Toner blueToner = new Toner(100, "Blue");
        Toner greenToner = new Toner(100, "Green");
        Spreedsheets spreedsheets = new Spreedsheets(100);

        Printer printer = new Printer(redToner, greenToner, blueToner, spreedsheets);


        printer.print(34);
        System.out.println(spreedsheets.getAmmount());

        System.out.println(printer.getBlueToner().getLevel());
        printer.tonerReplace();
        System.out.println(printer.getBlueToner().getLevel());

        // write your code here
    }
}
