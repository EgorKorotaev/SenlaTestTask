package com.ru.faunus.senla2020.test.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        CheckAndCall();
    }

    private static void CheckAndCall() {
        System.out.print("Задание 3: введите предложение ");
        Scanner scanner = new Scanner(System.in);
        try {
            String[] line = scanner.nextLine().split(" ");
            ArrayList<String> words = new ArrayList<>(Arrays.asList(line));
            for (int i = 0; i < words.size(); i++) {
                words.set(i, words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1));
            }
            Collections.sort(words);
            StringBuilder output = new StringBuilder();
            for (String word : words) {
                output.append(word).append(" ");
            }
            System.out.println("количество слов: " + words.size() + "\n" + output);
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }
}
