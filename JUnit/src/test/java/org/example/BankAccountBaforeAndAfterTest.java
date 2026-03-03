 package org.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
 
public class BankAccountBaforeAndAfterTest {
    
   static BankAccount account;
    
    @BeforeEach
    public void setup(){
        System.out.println("Hello!");
         account = new BankAccount(1000, 0);
    }
    @Test
    @Order(1)
    public void testWithdraw(){
        account.withdraw(100);
        assertEquals(900, account.getBalance());
    }

    @Test
    @Order(2)
    public void testDeposit(){
        account.deposit(200);
        assertEquals(1200, account.getBalance());
    }

    @AfterEach
    public void endTest(){
        System.out.println("Bye");
    }
}
