package com.apeiron.abs2;

class PalindromeNumber {
    boolean status = false;

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(100)); // false
        System.out.println(new PalindromeNumber().isPalindrome(1221)); // true
        System.out.println(new PalindromeNumber().isPalindrome(-100)); // false
        System.out.println(new PalindromeNumber().isPalindrome(-1001)); // false
        System.out.println(new PalindromeNumber().isPalindrome(1001)); // true
    }

    public boolean isPalindrome(int x) {
        int originalValue = x;
        int initialCounter = 1;
        int finalSum = 0;
        int altX = 0;
        altX = x;
        while (altX >= 10) {
            altX = altX / 10;
            initialCounter = initialCounter * 10;
        }
        while (x >= 10) {
            finalSum += (x % 10) * initialCounter;
            initialCounter = initialCounter / 10;
            x = x / 10;
        }
        if (x >= 1 & (originalValue % 10 != 0))
            finalSum += x * initialCounter;
        if (finalSum == originalValue) {
            status = true;
        }
        return status;
    }
}