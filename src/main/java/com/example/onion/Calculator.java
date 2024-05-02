package com.example.onion;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    int add(int i, int j){
        return i+j;
    }

    int subtract(int i, int j){
        return i-j;
    }

    int multiply(int i, int j){
        return i*j;
    }

    int divide(int i, int j){
        return i/j;
    }

    int separate(String str){
        String[] strArr = str.split(",|:");
        int add = 0;
        for (String s : strArr) {
            int number = Integer.parseInt(s);
            if(number < 0){
                throw new RuntimeException();
            }
            add += number;
        }
        return add;
    }
}
