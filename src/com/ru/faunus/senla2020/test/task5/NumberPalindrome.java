package com.ru.faunus.senla2020.test.task5;

class NumberPalindrome {

    public static boolean checkingForPalindrome(int num) {
        String numStr = String.valueOf(num);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }
}
