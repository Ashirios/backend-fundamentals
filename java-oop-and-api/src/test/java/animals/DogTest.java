package animals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.animals.Animal;
import com.example.animals.Cat;
import com.example.animals.Dog;
import org.junit.jupiter.api.Test;



public class DogTest {

    private Dog dog = new Dog();
    private Animal genericDog = new Dog();
    private Animal genericCat = new Cat();

    @Test
    public void testDogMakeSound(){
        assertEquals("Bark", dog.makeSound());
    }

    @Test
    public void testGenericDogMakeSound(){
        assertEquals("Bark", genericDog.makeSound());
    }

    @Test
    public void testDogFetch(){
        assertEquals("Fetching the ball!", dog.fetch());
    }

    @Test
    public void testMakeGenericDogToGenericCat(){
        genericDog = genericCat;
        assertEquals("Meow", genericDog.makeSound());
    }

    @Test
    public void testGenericDogLikeDogFetch(){
        Dog castedDog = (Dog) genericDog;
        //((Dog) genericDog).fetch(); // Casting to Dog to access fetch method
        assertEquals("Fetching the ball!", castedDog.fetch());
    }

}
