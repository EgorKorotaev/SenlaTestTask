package com.ru.faunus.senla2020.test.task2;

public class GsdLcm {
    private int numberA;
    private int numberB;
    private final int numberA2;
    private final int numberB2;

    public GsdLcm(int numberA, int numberB) {
        this.numberA = numberA;
        numberA2 = numberA;
        this.numberB = numberB;
        numberB2 = numberB;
    }

    public int gcd() {
        if (numberA % numberB == 0) {
            return numberB;
        } else if (numberB % numberA == 0) {
            return numberA;
        }
        if (numberA > numberB) {
            numberA = numberA % numberB;
        } else {
            numberB = numberB % numberA;
        }
        return gcd();
    }

    public int lcm() {
        return (numberA2 * numberB2) / gcd();
    }
}