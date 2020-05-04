package com.ru.faunus.senla2020.test.task5;

import java.util.Scanner;

public class NumberPalindromeApplication {
    public static void main(String[] args) {
        System.out.print("Задание 5: введите целое число меньше 101 до которого будут найдены палиндромы ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp <= 100) {
                    NumberPalindrome number = new NumberPalindrome(temp);
                    System.out.println(number.palindrome());
                } else {
                    System.out.println("Ошбика ввода: введено число больше 100");
                }
            } else {
                System.out.println("Ошбика ввода: введено не целое число");
            }
        }
    }
}