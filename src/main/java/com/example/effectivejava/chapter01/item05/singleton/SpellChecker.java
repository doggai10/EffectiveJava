package com.example.effectivejava.chapter01.item05.singleton;

import com.example.effectivejava.chapter01.item05.DefaultDictionary;
import com.example.effectivejava.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private static final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker(){}

    private static final SpellChecker INSTANCE = new SpellChecker();

    public static boolean isValid(String word){
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo){
        return dictionary.closeWordsTo(typo);
    }

}
