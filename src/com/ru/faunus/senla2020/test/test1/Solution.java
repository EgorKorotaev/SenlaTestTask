package com.ru.faunus.senla2020.test.test1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        CheckAndCall();
    }

    private static void CheckAndCall() {
        System.out.print("Задание 1: введите целое число ");
        Scanner scanner = new Scanner(System.in); try {
//        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();

                String res = "Число " + n + " ";
                if (n % 2 == 0) {
                    res = res.concat("чётное ");
                } else {
                    res = res.concat("не чётное ");
                }

                boolean j = true;
                for (int i = 2; i * i <= n & j; i++) {
                    if (n % i == 0) {
                        j = false;
                    }
                }
                if (!j) {
                    res = res.concat("и составное число");
                } else {
                    res = res.concat("и простое число");
                }

                System.out.println(res);
            } else {
                scanner.close();
                System.out.println("Ошбика ввода: введено не целое число");
            }
        } catch (Exception e){}
    }
}