package com.example.effectivejava.chapter01.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(";;;");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for(int i=0; i<100;i++){
            String name =" test;;;test1";
            name.split(";;;");
            //SPLIT_PATTERN.split(name);
        }
        System.out.println(System.nanoTime()-start);
    }
}
