package com.example.onion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add(){
        Calculator cal = new Calculator();
        assertEquals(9, cal.add(6,3));
    }

    @Test
    public void subtract(){
        Calculator cal = new Calculator();
        assertEquals(3, cal.subtract(6,3));
    }
}
