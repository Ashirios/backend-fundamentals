package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.math.Rectangle;
import com.example.math.Shape;
import org.junit.jupiter.api.Test;



public class RectangleTest {

    @Test
    public void testRectangleArea(){
        Shape rectangle = new Rectangle(4.0, 5.0);
        assertEquals(20.0, rectangle.calculateArea());
    }

}
