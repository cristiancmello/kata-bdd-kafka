package com.example.katabddkafka;

public class Account {
    private int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void credit(int amount) {
        balance += amount;
    }
}
