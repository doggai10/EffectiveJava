package com.example.effectivejava.chapter01.item05.springioc;

import com.example.effectivejava.chapter01.item05.Dictionary;
import com.example.effectivejava.chapter01.item05.dependencyinjection.DictionaryFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;

@Component
public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public SpellChecker(DictionaryFactory dictionaryFactory){
        this.dictionary = dictionaryFactory.get();
    }

    public SpellChecker(Supplier<? extends Dictionary> dictionarySupplier){
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word){
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo){
        return dictionary.closeWordsTo(typo);
    }
}