package org.example.preparingCode;

import java.time.LocalDateTime;

import org.example.preparingcode.TestableCode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestableCodeTest {

    private static TestableCode tc = new TestableCode();

    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting(){
        String name = "Noah";
        String outcome = "I don't know you, " + name + ", but you are special!";
        assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting special and known name")
    public void testSpecialAndKnownNameGreeting(){
        String name = "Bob";
        String outcome = "I know you, " + name + "! You are even a special user.";
        assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting(){
        String name = "Tess";
        String outcome = "Hello Stranger!";
        assertEquals(outcome, tc.greetUser(name));
    }


    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart(){
        LocalDateTime date = LocalDateTime.of(2021, 8, 20, 5, 30);
        String outcome = "Good Night, ";
        assertEquals(outcome, tc.greetDay(date));
    }




    
}
