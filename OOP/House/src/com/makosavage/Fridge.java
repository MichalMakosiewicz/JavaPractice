package com.makosavage;

public class Fridge {

    private String model;
    private boolean working;
    private int food;

    public Fridge(String model, boolean working, int food) {
        this.model = model;
        this.working = working;
        this.food = food;
    }

    public String getModel() {
        return model;
    }

    public boolean isWorking() {
        return working;
    }

    public int getFood() {
        return food;
    }

    public void chechforfood(){
        System.out.println("Cheecked for food: " + food);
    }
}
