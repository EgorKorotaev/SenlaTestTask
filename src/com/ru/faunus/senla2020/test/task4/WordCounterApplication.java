package com.ru.faunus.senla2020.test.task4;

import java.util.Scanner;

public class WordCounterApplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Задание 4: введите предложение ");
            String list = scanner.nextLine();
            System.out.print("Введите искомое слово: ");
            String word = scanner.nextLine();
            WordCounter number = new WordCounter(list, word);
            System.out.println("Слово уптреблялось: " + number.wordCounter);
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }
}