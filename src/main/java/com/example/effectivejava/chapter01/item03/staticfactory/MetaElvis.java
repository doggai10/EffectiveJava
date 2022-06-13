package com.example.effectivejava.chapter01.item03.staticfactory;

public class MetaElvis<T>{

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis(){}

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance(){
        return (MetaElvis<T>) INSTANCE;
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

}
