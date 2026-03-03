package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountDisabledTest {

    @Test
    @Disabled("Temprorarly disabled due to maintenance")
    @DisplayName("Withdraw Test")
    public void testWithdraw(){
        BankAccount account = new BankAccount(1000.0, 100.0);
        account.withdraw(200.0);
        assertEquals(800.0,account.getBalance());
    }

    

    
}
