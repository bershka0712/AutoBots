package com.autobots.java.bankApplication;

public class MBank extends BankBase{

    private double balance = 200;

    public MBank(long accountNumber, long routingNumber) {
        super(accountNumber, routingNumber);
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withDraw(double amount) {

    }
}
