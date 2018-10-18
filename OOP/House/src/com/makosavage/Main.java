package com.makosavage;

public class Main {

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen(new Chair("Wood", "Black"), new Table("Large", 4), new Fridge("ATK-9", true, 10));
        Livingroom livingroom = new Livingroom(new Couch(5),new TV(true,5));
        Bathroom bathroom = new Bathroom(new Tub(50),new Toilet(3));
        House house = new House(kitchen, livingroom, bathroom);

        kitchen.light();
        bathroom.getToilet().flush();
        livingroom.getTv().setChannel(56);
        System.out.println(livingroom.getTv().getChannel());


    }
}
