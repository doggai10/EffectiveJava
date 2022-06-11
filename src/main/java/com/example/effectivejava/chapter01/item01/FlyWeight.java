package com.example.effectivejava.chapter01.item01;

public class FlyWeight {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        CharacterAfter c1 = new CharacterAfter('h', "white", fontFactory.getFont("nanum:12"));
        CharacterAfter c2 = new CharacterAfter('h', "white", fontFactory.getFont("nanum:12"));
        CharacterAfter c3 = new CharacterAfter('h', "white", fontFactory.getFont("nanum:12"));
    }
}
