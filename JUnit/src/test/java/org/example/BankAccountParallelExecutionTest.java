package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParallelExecutionTest {
    @Test
    @DisplayName("Deposit Test")
    public void testDeposit(){
        //  try {
        //     Thread.sleep(100);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        BankAccount account = new BankAccount(900.0,0.0);
        account.deposit(100);
        assertEquals(1000, account.getBalance());
    }
    @Test
    @DisplayName("Deposit Test")
    public void testDeposit2(){
        //  try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        BankAccount account = new BankAccount(900.0,0.0);
        account.deposit(100);
        assertEquals(1000, account.getBalance());
    }
    @Test
    @DisplayName("Deposit Test")
    public void testDeposit3(){
        //  try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        BankAccount account = new BankAccount(900.0,0.0);
        account.deposit(100);
        assertEquals(1000, account.getBalance());
    }

}
