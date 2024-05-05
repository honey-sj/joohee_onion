package com.example.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.calculator.StringCalculator;

public class StringCalculatorTest {

    private StringCalculator cal;

    @Before //초기화 작업
    public void setup(){
        cal = new StringCalculator();
        System.out.println("before");
    }

    @Test
    public void nullCheck1(){
        String s = "";
        assertEquals(0, cal.separate(s));
    }

    @Test
    public void nullCheck2(){
        String s = null;
        assertEquals(0, cal.separate(s));
    }

    @Test
    public void separate(){
        String s = "1,2:3\n4";
        assertEquals(10, cal.separate(s));
    }

    @Test(expected = RuntimeException.class)
    public void match(){
        String s = "//;\n-1;2;3";
        assertEquals(6, cal.separate(s));
    }

    @Test
    public void whenException(){
        Exception e = assertThrows(RuntimeException.class, () -> {
            String s = "//;\n-1;2;3";
            cal.separate(s);
        });
    }

    @After //후처리 작업
    public void teardown(){
        System.out.println("teardown");
    }
}
