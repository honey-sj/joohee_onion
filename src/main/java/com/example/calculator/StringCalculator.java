package com.example.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int separate(String str){

        int add = 0;

        if(isBlank(str)){
            return 0;
        }

        String[] strArr = null;

        Matcher m = getMatcher(str);

        if (m.find()){
            String s1 = m.group(1);
            strArr = m.group(2).split(s1);
        } else {
            strArr = getSplit(str);
        }

        return sum(toInts(strArr));
    }

    private static Matcher getMatcher(String str) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        return m;
    }

    private static int[] toInts(String[] values){
        int[] numbers = new int[values.length];
        for(int i = 0 ; i < values.length ; i++){
            numbers[i]  = checkMinus(values[i]);
        }
        return numbers;
    }

    private static int checkMinus(String value){
        if(Integer.parseInt(value) < 0 ) {
            throw new RuntimeException();
        }
        return Integer.parseInt(value);
    }

    private int sum(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static String[] getSplit(String str) {
        return str.split(",|:|\n");
    }

    private static boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }
}
