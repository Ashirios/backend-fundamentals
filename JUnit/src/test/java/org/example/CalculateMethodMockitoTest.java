package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculateMethodMockitoTest {
    @Mock
    CalculateMethods calculateMethods;

    @BeforeEach
    public void setup(){
        Mockito.when(calculateMethods.divide(9,3)).thenReturn(3.0);
    }

    @Test
    public void testDivide(){
        assertEquals(3.0, calculateMethods.divide(9,3));
    }
}
