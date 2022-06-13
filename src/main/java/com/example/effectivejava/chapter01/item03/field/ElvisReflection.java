package com.example.effectivejava.chapter01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {
    public static void main(String[] args) {
        try{
            Constructor<Elvis> defaultContstructor = Elvis.class.getDeclaredConstructor();
            defaultContstructor.setAccessible(true);
            Elvis elvis1 = defaultContstructor.newInstance();
            Elvis elvis2 = defaultContstructor.newInstance();
            System.out.println(elvis1==elvis2);
        }catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
