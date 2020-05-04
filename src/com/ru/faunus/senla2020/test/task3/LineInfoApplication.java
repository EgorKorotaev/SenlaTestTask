package com.ru.faunus.senla2020.test.task3;

import java.util.Scanner;

public class LineInfoApplication {
    public static void main(String[] args) {
        System.out.print("Задание 3: введите предложение ");
        try (Scanner scanner = new Scanner(System.in)) {
            LineInfo words = new LineInfo(scanner.nextLine());
            words.workToLine();
            System.out.println("количество слов: " + words.count + "\n" + words.words);
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат");
        }
    }
}