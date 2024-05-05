package com.example.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int separate(String str){

        int add = 0;

        //null 체크를 먼저 해줘야 빈값체크를 할 수가 있다. 순서 주의!
        if(str == null){
            return 0;
        }

        if(str.isEmpty()){
            return 0;
        }

        String[] strArr = null;

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);

        if (m.find()){
            String s1 = m.group(1);
            strArr = m.group(2).split(s1);
        }
        if(!m.find()){
            strArr = str.split(",|:|\n");
        }

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
