package Solution.Test_2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void check_and_call() {
        System.out.print("Задание 2: введите два целых числа ");
        Scanner scanner = new Scanner(System.in);
        try {
            int[] arr = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.print("НОД: " + Test_2.NOD(arr[0], arr[1]) + "\nНОК: " + Test_2.NOK(arr[0], arr[1]));
        } catch (NumberFormatException e) {
            System.out.println("Ошбика ввода: неверный формат чисел");
        }
    }
}