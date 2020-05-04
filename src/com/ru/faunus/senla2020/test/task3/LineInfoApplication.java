package com.ru.faunus.senla2020.test.task3;

import com.ru.faunus.senla2020.test.task1.NumberInfo;

import java.util.Scanner;

public class LineInfoApplication {
    public static void main(String[] args) {
        System.out.print("Задание 1: введите целое число ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                NumberInfo number = new NumberInfo(scanner.nextInt());
                StringBuilder output = new StringBuilder();
                output.append("Число ").append(number.getNumber()).append(" ");
                if (number.isEven()) {
                    output.append("чётное ");
                } else {
                    output.append("не чётное ");
                }
                if (number.isPrime()) {
                    output.append("и составное число");
                } else {
                    output.append("и простое число");
                }
                System.out.println(output);
            } else {
                System.out.println("Ошбика ввода: введено не целое число");
            }
        }
    }
}