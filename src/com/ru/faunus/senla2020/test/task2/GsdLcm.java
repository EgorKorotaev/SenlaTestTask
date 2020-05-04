package com.ru.faunus.senla2020.test.task2;

import java.util.Arrays;
import java.util.Scanner;

public class GsdLcm {
    public static void main(String[] args) {
        CheckAndCall();
    }

    private static void CheckAndCall() {
        System.out.print("Задание 2: введите два целых числа ");
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.print("НОД: " + gcd(arr[0], arr[1]) + "\nНОК: " + lcm(arr[0], arr[1]));
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        }
        if (a > b) {
            return gcd(a % b, b);
        } else {
            return gcd(a, b % a);
        }
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}