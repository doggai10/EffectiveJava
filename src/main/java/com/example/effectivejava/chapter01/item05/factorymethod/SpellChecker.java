package com.example.effectivejava.chapter01.item05.factorymethod;

import com.example.effectivejava.chapter01.item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory){
        this.dictionary= dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word){
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo){
        return dictionary.closeWordsTo(typo);
    }
}

