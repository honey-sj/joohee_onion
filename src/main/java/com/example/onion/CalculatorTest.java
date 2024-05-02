package com.example.onion;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator cal;

    @Before //초기화 작업
    public void setup(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add(){
        assertEquals(9, cal.add(6,3));
        System.out.println("add");
    }

    @Test
    public void subtract(){
        assertEquals(3, cal.subtract(6,3));
        System.out.println("subtract");
    }

    @After //후처리 작업
    public void teardown(){
        System.out.println("teardown");
    }
}
