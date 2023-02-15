package com.example.katabddkafka;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TransferAmountBetweenAccountsTests {
    @Test
    void shouldHaveSavingsAndCurrentAccountsDifferentAfterRequestTransfer() {
        // Arrange = Given
        var currentAccount = new CurrentAccount(1000);
        var savingsAccount = new SavingsAccount(600);
        var transferAmountManager = new TransferAmountManager();

        // Act = When
        transferAmountManager.transfer(currentAccount, savingsAccount, 300);

        // Assert = Then
        assertThat(currentAccount.getBalance()).isEqualTo(700);
        assertThat(savingsAccount.getBalance()).isEqualTo(900);
    }
}
