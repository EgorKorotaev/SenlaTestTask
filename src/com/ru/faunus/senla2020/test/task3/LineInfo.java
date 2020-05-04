package com.ru.faunus.senla2020.test.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LineInfo {
    public String words;
    public int count;

    public LineInfo(String line) {
        this.words = line;
    }

    public void workToLine() {
        String[] line = words.split(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(line));
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1));
        }
        Collections.sort(words);
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            output.append(word).append(" ");
        }
        this.words = output.toString();
        this.count = words.size();
    }
}