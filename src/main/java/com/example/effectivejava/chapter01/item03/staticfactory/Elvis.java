package com.example.effectivejava.chapter01.item03.staticfactory;

public class Elvis implements Singer {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){}

    public static Elvis getInstance(){
        return INSTANCE;
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby, I'm outta here!");
    }

    @Override
    public void sing() {
        System.out.println("my way~~~");
    }
}
