package com.ru.faunus.senla2020.test.task5;

import java.util.Scanner;

public class NumberPalindromeApplication {
    public static void main(String[] args) {
        System.out.print("Задание 5: введите целое число меньше 101 до которого будут найдены палиндромы ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp <= 100) {
                    StringBuilder output = new StringBuilder();
                    for (int i = 0; i <= temp; i++) {
                        if (NumberPalindrome.checkingForPalindrome(i)) {
                            output.append(i).append(" ");
                        }
                    }
                    System.out.println(output);
                } else {
                    System.out.println("Ошбика ввода: введено число больше 100");
                }
            } else {
                System.out.println("Ошбика ввода: введено не целое число");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }
}