package com.example.effectivejava.chapter01.item01;

public class Font {

    final String familly;

    final int size;

    public Font(String familly, int size) {
        this.familly = familly;
        this.size = size;
    }

    public String getFamilly() {
        return familly;
    }

    public int getSize() {
        return size;
    }
}
