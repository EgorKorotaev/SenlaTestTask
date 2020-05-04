package com.ru.faunus.senla2020.test.test1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(checkingForParityAndSimplicity(scanner.nextInt()));
        }
    }

    public static String main(int args) {
        return checkingForParityAndSimplicity(args);
    }

    private static String checkingForParityAndSimplicity(int args) {
        String res = "Число " + args + " ";
        if (args % 2 == 0) {
            res = res.concat("чётное ");
        } else {
            res = res.concat("не чётное ");
        }

        boolean j = false;
        for (int i = 2; i * i <= args; i++) {
            if (args % i == 0) {
                j = true;
                break;
            }
        }
        if (j) {
            res = res.concat("и составное число");
        } else {
            res = res.concat("и простое число");
        }

        return res;
    }
}