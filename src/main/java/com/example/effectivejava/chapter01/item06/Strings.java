package com.example.effectivejava.chapter01.item06;

public class Strings {

    public static void main(String[] args) {
        String hello = "hello";

        // 이 방법 권장 X
        String hello2 = new String("hello");

        String hello3 = "hello";
    }
}
