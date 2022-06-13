package com.example.effectivejava.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    LocalDate birthday;

    public Person() {}

    public static int compareByAgeV1(Person a, Person b){
        return a.birthday.compareTo(b.birthday);
    }

    public int compareByAgeV2( Person b){
        return this.birthday.compareTo(b.birthday);
    }

    public Person(LocalDate birthday){
        this.birthday=birthday;
    }

    public int getAge(){
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1999,1,10));
        dates.add(LocalDate.of(1989,1,10));
        dates.add(LocalDate.of(1979,1,10));
        List<Person> collect = dates.stream().map(Person::new).collect(Collectors.toList());

        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1999,1,10)));
        people.add(new Person(LocalDate.of(1949,1,10)));
        people.add(new Person(LocalDate.of(1939,1,10)));

        people.sort(Person::compareByAgeV1);
//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person a, Person b) {
//                return a.birthday.compareTo(b.birthday);
//            }
//        });
//
//        people.sort((p1,p2)-> p1.birthday.compareTo(p2.birthday));


//        Person person = new Person(null);
//        people.sort(person::compareByAge);
//        people.sort(Person::compareByAgeV2);
    }

}
