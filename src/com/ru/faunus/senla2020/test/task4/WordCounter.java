package com.ru.faunus.senla2020.test.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class WordCounter {
    public String line;
    public String word;
    public int wordCounter;

    public WordCounter(String line, String word) {
        this.line = line;
        this.word = word;
        wordCounter();
    }

    private void wordCounter() {
        String[] line = this.line.split(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(line));
        for (int i = 0; i < words.size(); i++) {
            if (this.word.toUpperCase().equals(word.toUpperCase())) {
                wordCounter++;
            }
        }
    }
}
