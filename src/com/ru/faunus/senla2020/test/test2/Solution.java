package com.ru.faunus.senla2020.test.test2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        CheckAndCall();
    }

    private static void CheckAndCall() {
        System.out.print("Задание 2: введите два целых числа ");
        Scanner scanner = new Scanner(System.in); try {
//        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.print("НОД: " + GCD(arr[0], arr[1]) + "\nНОК: " + LCM(arr[0], arr[1]));
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }

    private static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        }
        if (a > b) {
            return GCD(a % b, b);
        } else {
            return GCD(a, b % a);
        }
    }

    private static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}