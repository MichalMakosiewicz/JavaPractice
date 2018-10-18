package com.makosavage;

public class Kitchen {

    private Chair chair;
    private Table table;
    private Fridge fridge;

    public Kitchen(Chair chair, Table table, Fridge fridge) {
        this.chair = chair;
        this.table = table;
        this.fridge = fridge;
    }

    public void light(){
        System.out.println("LIGHT!!!");
    }
}
