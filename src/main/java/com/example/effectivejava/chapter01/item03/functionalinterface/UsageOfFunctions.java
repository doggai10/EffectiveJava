package com.example.effectivejava.chapter01.item03.functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsageOfFunctions {

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1991,1,10));
        dates.add(LocalDate.of(1990,1,10));
        dates.add(LocalDate.of(1989,1,10));

        List<Integer> before2000 = dates.stream()
                .filter(d->d.isBefore(LocalDate.of(2000,1,1)))
                .map(LocalDate::getYear)
                .collect(Collectors.toList());
    }
}
