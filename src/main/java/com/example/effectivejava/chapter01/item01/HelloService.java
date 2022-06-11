package com.example.effectivejava.chapter01.item01;

public interface HelloService {

    String hello();

    static HelloService of(String lang){
        if(lang.equals("ko")) return  new KoreanHelloService();
        return new EnglishHelloService();
    }

    static String hi(){
        prepareMessage();
        return "hi";
    }

    private static void prepareMessage() {
    }

    default String bye(){
        prepareMessage();
        return "bye";
    }

}
