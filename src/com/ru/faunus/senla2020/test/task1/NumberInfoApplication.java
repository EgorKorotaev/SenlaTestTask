package com.ru.faunus.senla2020.test.task1;

import java.util.Scanner;

public class NumberInfoApplication {
    public static void main(String[] args) {
        System.out.print("Задание 1: введите целое число ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                NumberInfo number = new NumberInfo(scanner.nextInt());
                String output = "Число " + number.setnumber() + " ";
                if (number.isEven()) {
                    output = output.concat("чётное ");
                } else {
                    output = output.concat("не чётное ");
                }
                if (number.isPrime()) {
                    output = output.concat("и составное число");
                } else {
                    output = output.concat("и простое число");
                }
                System.out.println(output);
            } else {
                System.out.println("Ошбика ввода: введено не целое число");
            }
        }
    }
}
