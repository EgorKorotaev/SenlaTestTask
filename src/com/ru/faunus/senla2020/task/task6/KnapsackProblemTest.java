package com.ru.faunus.senla2020.task.task6;

public class KnapsackProblemTest {
    public static void main(String[] args) {
        System.out.println("Задание 6: Задача о рюкзаке");
        System.out.println("Рюкзам вместимостью 13\n" +
                "1 предмет: вес 3 цена 1\n" +
                "2 предмет: вес 4 цена 6\n" +
                "3 предмет: вес 5 цена 4\n" +
                "4 предмет: вес 8 цена 7\n" +
                "5 предмет: вес 9 цена 6");
        KnapsackProblem test = new KnapsackProblem(13);
        test.addObject(new Item(3, 1));
        test.addObject(new Item(4, 6));
        test.addObject(new Item(5, 4));
        test.addObject(new Item(8, 7));
        test.addObject(new Item(9, 6));
        test.findAns();
        System.out.println(test.ans());
    }
}
