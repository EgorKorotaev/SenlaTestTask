package com.ru.faunus.senla2020.test.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        CheckAndCall();
    }

    private static void CheckAndCall() {
        System.out.print("Задание 4: введите предложение ");
        Scanner scanner = new Scanner(System.in);
        try {
            String[] line = scanner.nextLine().split(" ");
            ArrayList<String> words = new ArrayList<>(Arrays.asList(line));
            System.out.print("Введите искомое слово: ");
            Scanner scan = new Scanner(System.in);
            String reference = scan.nextLine();
            int counter = 0;
            for (String word : words) {
                if (reference.toUpperCase().hashCode() == word.toUpperCase().hashCode()) {
                    counter++;
                }
            }
            System.out.println("Слово уптреблялось: " + counter);
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }
}
