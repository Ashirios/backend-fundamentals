package org.example;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTestTest {

    @ParameterizedTest
    @ValueSource(ints = {100,200,300})
    @DisplayName("Deposit Test")
    public void testDeposit(int amount, BankAccount account){
        account.deposit(amount);
        assertEquals(amount, account.getBalance());
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY", "THURSDAY"})
    public void testDayOfWeek(DayOfWeek day){
        assertTrue(day.toString().startsWith("T"));
    }

    
    // @CsvSource({
    //     "100, John Doe",
    //     "200, Jane Doe",
    //     "300, Jack Smith"
    // })
    @ParameterizedTest
    @CsvFileSource(resources = "/details.csv", delimiter=',')
    public void depositNameAndTes(double amount, String name, BankAccount account){
        account.setHolderName(name);
        account.deposit(amount);
        assertEquals(amount, account.getBalance());
        assertEquals(name, account.getHolderName());
    }
}
