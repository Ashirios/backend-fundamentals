package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTestTest {
    // 
    @RepeatedTest(5)
    @DisplayName("Deposit Test")
    public void testDeposit(BankAccount account){
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }
    @RepeatedTest(5)
    @DisplayName("Deposit Test")
    public void testDepositRepetitionInfo(BankAccount account, RepetitionInfo repetitionInfo){
        account.deposit(100);
        assertEquals(100, account.getBalance());
        System.out.println("Deposit test executed : " + repetitionInfo.getCurrentRepetition() );
    }
}
