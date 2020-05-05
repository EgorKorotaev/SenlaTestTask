package com.ru.faunus.senla2020.test.task4;

import java.util.Scanner;

public class WordCounterApplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Задание 4: введите предложение ");
            String list = scanner.nextLine();
            System.out.print("Введите искомое слово: ");
            String word = scanner.nextLine();
            WordCounter wordCounter = new WordCounter(list);
            System.out.println("Слово уптреблялось: " + wordCounter.wordCounter(word));
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода");
        }
    }
}
