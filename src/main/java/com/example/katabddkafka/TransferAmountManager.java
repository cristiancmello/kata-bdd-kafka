package com.example.katabddkafka;

public class TransferAmountManager {
    public void transfer(CurrentAccount currentAccount, SavingsAccount savingsAccount, int amount) {
        currentAccount.withdraw(amount);
        savingsAccount.credit(amount);
    }
}
