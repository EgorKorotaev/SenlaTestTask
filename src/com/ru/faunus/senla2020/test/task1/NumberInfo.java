package com.ru.faunus.senla2020.test.task1;

public class NumberInfo {
    private final int number;

    public NumberInfo(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public boolean isEven(){
        return number % 2 == 0;
    }

    public boolean isPrime(){
        boolean flag = false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}