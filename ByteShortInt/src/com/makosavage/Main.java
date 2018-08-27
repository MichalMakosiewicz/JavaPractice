package com.makosavage;

public class Main {

    public static void main(String[] args) {
	    //byte -128 - 127
        byte myByte = 120;
        //short -32_768 - 32_767
        short myShort = 30000;
        //int -2_147_483_648 - 2_147_483_647
        int myInt = 200000000;
        //long 9_223_327_036_854_775_807L


        long myLong = 50000L + 10L * (myByte + myShort + myInt);

        System.out.println(myLong);
    }
}
