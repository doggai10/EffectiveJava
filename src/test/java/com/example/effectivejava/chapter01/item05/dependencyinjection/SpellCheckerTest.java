package com.example.effectivejava.chapter01.item05.dependencyinjection;

import com.example.effectivejava.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker1 = new SpellChecker(new DefaultDictionary());
        spellChecker1.isValid("test");

        SpellChecker spellChecker2 = new SpellChecker(DefaultDictionary::new);
        spellChecker2.isValid("test");
    }
}