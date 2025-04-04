package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    BankAccount  acc1;

    @BeforeEach
    void setup(){
        acc1=new BankAccount();
        acc1.setBalance(1000);
    }
    @Test
    public void DepositTest(){
        acc1.setBalance(10);
        acc1.deposit(100);
        Assertions.assertEquals(110,acc1.getBalance());
    }

    @Test
    public void WithdrawTest(){
        acc1.setBalance(100);
        acc1.withdraw(40);
        Assertions.assertEquals(60,acc1.getBalance());
    }
    @Test
    public void getBalance(){
        int balance=acc1.getBalance();
        Assertions.assertEquals(1000,acc1.getBalance());

    }

}
