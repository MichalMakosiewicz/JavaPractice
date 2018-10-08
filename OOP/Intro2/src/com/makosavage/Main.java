package com.makosavage;

public class Main {

    public static void main(String[] args) {

        BankAccount NoweKonto = new BankAccount();

        NoweKonto.createAccount(12345,3000,"Andrzej Walsek", "walse@gmal.com", 543234678);

        NoweKonto.deposit(400);
        NoweKonto.withdraw(1300);
        NoweKonto.withdraw(2300);

    }
}
