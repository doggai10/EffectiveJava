package com.example.effectivejava.chapter01.item01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {

    public static void main(String[] args) {
        List<Integer>numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(90);
        numbers.add(80);
        numbers.add(70);

        System.out.println(numbers);

        Comparator<Integer> desc = (o1, o2) -> o2-o1;

        numbers.sort(desc.reversed());

        System.out.println(numbers);
    }
}
