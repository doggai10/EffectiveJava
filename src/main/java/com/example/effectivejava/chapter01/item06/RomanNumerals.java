package com.example.effectivejava.chapter01.item06;

import java.util.regex.Pattern;

public class RomanNumerals {

    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 코드 6-2 값비싼 객체를 재사용해 성능을 개선한다.
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s){
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        boolean result = false;
        long start= System.nanoTime();
        for(int i=0; i<100;i++){
            //result = isRomanNumeralFast("MXALEDS");
            result = isRomanNumeralFast("MXALEDS");
        }
        long end= System.nanoTime();
        System.out.println(end-start);
        System.out.println(result);
    }
}
