package garage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.garage.Coupe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class CoupeTest {

    private Coupe coupe = new Coupe();

    @Test
    @DisplayName("Test that Coupe is blue")
    public void testCoupeColor(){
        coupe.setColor("blue");
        assertEquals("blue", coupe.getColor());
    }

    @Test
    @DisplayName("Test that Coupe has 2 doors")
    public void testCoupeDoors(){
        assertEquals(2, coupe.getDoors());
    }


    
}
