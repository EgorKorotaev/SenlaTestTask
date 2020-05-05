package com.ru.faunus.senla2020.test.task2;

import java.util.Arrays;
import java.util.Scanner;

public class GslLcmApplication {
    public static void main(String[] args) {
        System.out.print("Задание 2: введите два целых числа ");
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println("НОД: " + MathUtils.gcd(arr[0], arr[1]) + "\nНОК: " + MathUtils.lcm(arr[0], arr[1]));
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }
}