package com.makosavage;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void createAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this. email = email;
        this.phoneNumber = phoneNumber;

    }

    public void deposit(int ammount){
        this.balance += ammount;
        System.out.println("Balance: " + this.balance);
    }

    public void withdraw(int ammount){
        if (ammount<=this.balance){
            System.out.println("You have withdraw " + ammount);
            this.balance -= ammount;
            System.out.println("Your balance is " + this.balance);
        }else {
            System.out.println("Lack of funds!");
            System.out.println("Balance: "+this.balance);
        }
    }

}
