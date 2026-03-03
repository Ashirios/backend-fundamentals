package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {
    @Test
    @DisplayName("Deposit Test")
    public void testDeposit(BankAccount account){
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }
}
