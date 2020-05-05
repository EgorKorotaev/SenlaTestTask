package com.ru.faunus.senla2020.task.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCounter {
    private final String line;

    public WordCounter(String line) {
        this.line = line;
    }

    public int wordCounter(String word) {
        String[] line = this.line.split(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(line));
        int wordCounter = 0;
        for (String s : words) {
            if (s.toUpperCase().equals(word.toUpperCase())) {
                wordCounter++;
            }
        }
        return wordCounter;
    }
}
