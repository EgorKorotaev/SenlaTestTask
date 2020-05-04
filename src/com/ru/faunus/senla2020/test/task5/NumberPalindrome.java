package com.ru.faunus.senla2020.test.task5;

class NumberPalindrome {

    private final int andNumber;

    public NumberPalindrome(int number) {
        this.andNumber = number;
    }

    private boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }

    public String palindrome() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= andNumber; i++) {
            if (isPalindrome(i)) {
                output.append(i).append(" ");
            }
        }
        return output.toString();
    }
}
