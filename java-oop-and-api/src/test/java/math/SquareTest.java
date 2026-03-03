package math;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.math.Rectangle;
import com.example.math.Square;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class SquareTest {

    @Test
    @DisplayName("Test that Square is a subclass of Rectangle")
    public void testSquareIsRectangleSubclass(){
        Square square = new Square(5.0, 5.0);
        assertTrue(square instanceof Rectangle);
    }

    @Test 
    @DisplayName("Test that Square class is not Rectangle class")
    public void testSquareIsSquareClass(){
        Square square = new Square(4.0, 4.0);
        assertNotEquals(Rectangle.class, square.getClass());
    }
    
        
}
