package com.apeiron.abs2.dailybyte;

public class PalindromeFinder {
    /*
    This question is asked by Facebook. Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
     */

    static String str1 = "level";
    static String str2 = "algorithm";
    static String str3 = "A man, a plan, a canal: Panama.";


    public static void main(String[] args) {
        System.out.println(palindrome(str3));
    }

    public static boolean palindrome(String inputStr) {
        String trimmedString = trimNonAlphabetsFromString(str3);
        return (trimmedString.equalsIgnoreCase(reverseString(trimmedString)) ? true : false);
    }

    public static String trimNonAlphabetsFromString(String str) {
        StringBuilder strOut = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr >= 'a' && chr <= 'b' && chr >= 'A' && chr <= 'Z') {
                strOut.append(chr);
            }
        }
        return strOut.toString();
    }

    public static String reverseString(String str) {
        for (int j = str.length() - 1; j >= 0; j--) {

        }
        return "";
    }
}
