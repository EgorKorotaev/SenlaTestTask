package com.ru.faunus.senla2020.task.task2;

public class MathUtils {

    public static int gcd(int numberA, int numberB) {
        if (numberA % numberB == 0) {
            return numberB;
        } else if (numberB % numberA == 0) {
            return numberA;
        }
        if (numberA > numberB) {
            return gcd(numberA % numberB, numberB);
        } else {
            return gcd(numberA, numberB % numberA);
        }
    }

    public static int lcm(int numberA, int numberB) {
        return (numberA * numberB) / gcd(numberA, numberB);
    }
}
