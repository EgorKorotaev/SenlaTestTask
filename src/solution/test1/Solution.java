package solution.test1;

import java.util.Scanner;

public class Solution {
    public static void check_and_call() {
        System.out.print("Задание 1: введите целое число ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            System.out.println(Check_int.test1(scanner.nextInt()));
            scanner.close();
        }
        else {
            scanner.close();
            System.out.println("Ошбика ввода: введено не целое число");
        }
    }
}
