package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CodeTest {

    private Code code;

    @BeforeEach
    public void init(){
        code = new Code();
    }

    @Test
    public void testSayHello(){
        assertEquals("Hello", code.sayHello());
    }

}
