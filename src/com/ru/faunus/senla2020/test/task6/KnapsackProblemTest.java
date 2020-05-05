package com.ru.faunus.senla2020.test.task6;

import java.util.Scanner;

public class KnapsackProblemTest {
    public static void main(String[] args) {
        System.out.println("Задание 6: Задача о рюкзаке");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите вместительность рюкзака: ");
            int temp = scanner.nextInt();
            KnapsackProblem knapsack = new KnapsackProblem(temp);
            System.out.print("Введите количество предметов: ");
            temp = scanner.nextInt();
            for(int i = 0; i < temp; i++){
                System.out.print("Введите вес " + (i+1) + "-ого предмета: ");
                int weight = scanner.nextInt();
                System.out.print("Введите стоимость " + (i+1) + "-ого предмета: ");
                int price = scanner.nextInt();
                knapsack.addObject(weight, price);
            }
            knapsack.findAns();
            System.out.println("");
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат");
        }
    }
}
