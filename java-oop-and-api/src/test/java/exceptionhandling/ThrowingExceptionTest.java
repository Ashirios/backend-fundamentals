package exceptionhandling;

import com.example.exceptionhandling.NegativeInputException;
import com.example.exceptionhandling.ThrowingExceptions;
import org.junit.jupiter.api.Test;







public class ThrowingExceptionTest {

    @Test
    public void testThrowingExceptions() throws NegativeInputException{
        
        ThrowingExceptions.calculatePay(-2, 0);
    }

}
