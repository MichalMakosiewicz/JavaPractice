package com.makosavage;

public class Spreedsheets {

    private int ammount;

    public Spreedsheets(int ammount) {
        this.ammount = ammount;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public void addSheets(int num){
        ammount+=num;
    }
}
