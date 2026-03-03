package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.Test;

public class BankAccountAssumptionTest {
    @Test
    public void testActive() {
        BankAccount account = new BankAccount(100, 0);
        System.out.println("Assumption check: account is null?");
        assumingThat(account != null, () -> assertTrue(account.isActive()) );
        //assumeTrue(account == null, "Account is null, skipping test");
        
    }
}
