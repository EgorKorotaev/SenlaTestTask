package com.ru.faunus.senla2020.test.test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        args();
    }

    private static void args() {
        System.out.print("Задание 1: введите целое число ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int args = scanner.nextInt();
                System.out.println(Solution.main(args));
            } else {
                scanner.close();
                System.out.println("Ошбика ввода: введено не целое число");
            }
        }
    }
}
