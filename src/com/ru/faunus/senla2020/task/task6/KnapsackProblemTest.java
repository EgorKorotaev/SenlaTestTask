package com.ru.faunus.senla2020.task.task6;

import java.util.Arrays;
import java.util.List;

public class KnapsackProblemTest {
    public static void main(String[] args) {
        System.out.println("Задание 6: Задача о рюкзаке");
        List<Item> items = Arrays.asList(
                new Item(0, 0),
                new Item(3, 1),
                new Item(4, 6),
                new Item(5, 4),
                new Item(8, 7),
                new Item(9, 6)
        );
        KnapsackProblem test = new KnapsackProblem(13, items);
        test.findAns();
        StringBuilder output = new StringBuilder();
        for (Item an : test.ans()) {
            output.append(an).append("\n");
        }
        System.out.println(output);
    }
}
