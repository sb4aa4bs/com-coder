package com.apeiron.abs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CharCount {
    static String inputString;
    static Set<CharCount> set;
    char character;
    int count;

    public CharCount(char character, int count){
        this.character = character;
        this.count = count;
    }

    public static void main(String[] args) throws IOException {
        set = new HashSet<CharCount>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inputString = reader.readLine();
        inputString = inputString.toUpperCase(Locale.ROOT);
        char[] chars = inputString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    counter++;
                }
            } // end j loop
            /*System.out.println("Element " +chars[i] +" count is " +counter);*/
            set.add(new CharCount(chars[i], counter));
        } // end i loop
        System.out.println(set.toString());
    }

    @Override
    public String toString() {
        return "CharCount{" +
                "character=" + character +
                ", count=" + count +
                '}';
    }
}
