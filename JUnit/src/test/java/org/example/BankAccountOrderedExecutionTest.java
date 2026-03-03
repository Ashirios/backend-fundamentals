package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrderedExecutionTest {
     static BankAccount account = new BankAccount(1000, 0);

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
        assertEquals(1100, account.getBalance());
    }


}
