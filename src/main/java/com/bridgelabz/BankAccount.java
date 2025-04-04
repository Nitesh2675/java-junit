package com.bridgelabz;

public class BankAccount {
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private String name;

    public void deposit(int deposit) {
        this.balance+=deposit;
    }

    public void withdraw(int withdraw) {
        if (this.balance >= withdraw) {
            this.balance -= withdraw;
        } else {
            System.out.println("balance is less than withdrawal amount");
        }
    }
}
