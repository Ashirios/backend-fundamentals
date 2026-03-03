package org.example;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw Test")
    public void testWithdraw(){
        BankAccount account = new BankAccount(1000.0, 100.0);
        account.withdraw(200.0);
        assertEquals(800.0,account.getBalance());
    }

    @Test
    @DisplayName("Deposit Test")
    public void testDeposit(){
        BankAccount account = new BankAccount(900.0,0.0);
        account.deposit(100);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testWithdrawNotStuckArZero(){
        BankAccount account = new BankAccount(1000, -5000);
        account.withdraw(3000);
        assertNotEquals(200, account.getBalance());
    }

    @Test
    public void testIsActive(){
        BankAccount account = new BankAccount(200, 0);
        assertTrue(account.isActive());
    }

    @Test
    public void testHolderName(){
        BankAccount account = new BankAccount(300, 0);
        account.setHolderName("John Doe");
        assertNotNull(account.getHolderName());
    }

    @Test
    public void testWithdrawNotBelowMinimum(){
        BankAccount account = new BankAccount(500, 100);
        assertThrows(RuntimeException.class, () -> account.withdraw(4500));
    }

    @Test
    public void testWithdrawAndDepositWithoutExceptions(){
        BankAccount account = new BankAccount(300,0);
        assertAll(() -> account.deposit(100),
                  () -> account.withdraw(200));
    }

    @Test
    public void testDepositTimeout(){
        //fail();
        BankAccount account = new BankAccount(200, 0);
        assertTimeout(Duration.ofNanos(1), () -> account.deposit(100), "Your computer is too slow!");
    }
}
