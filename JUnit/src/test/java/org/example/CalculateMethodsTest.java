package org.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;



public class CalculateMethodsTest {
    private CalculateMethods calculateMethods;

    @BeforeEach
    public void init(){
        calculateMethods = new CalculateMethods();
    }

    @Test
    public void testSum(){
        Assertions.assertEquals(10, calculateMethods.sum(5, 5));
    }

    @Test
    public void testDivideZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> calculateMethods.divide(5, 0));
    }

    @Test
    public void testProduct(){
        Assertions.assertEquals(20, calculateMethods.product(4, 5));
    }
}
