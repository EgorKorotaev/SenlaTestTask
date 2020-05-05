package com.ru.faunus.senla2020.task.task3;

import java.util.Scanner;

public class LineInfoApplication {
    public static void main(String[] args) {
        System.out.print("Задание 3: введите предложение ");
        try (Scanner scanner = new Scanner(System.in)) {
            SortAndCountWordsCapitalLetter words = new SortAndCountWordsCapitalLetter(scanner.nextLine());
            words.workToLine();
            System.out.println("количество слов: " + words.getCount() + "\n" + words.getWords());
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат");
        }
    }
}
