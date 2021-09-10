package com.apeiron.abs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CharCount implements Comparable<CharCount> {
    static String inputString;
    static Set<CharCount> set;
    char character;
    int count;

    public CharCount(char character, int count) {
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
            // set is chosen to filter duplicates
            set.add(new CharCount(chars[i], counter));
        } // end i loop
        // sort the set >> set -> list, sort the list, list to set
        System.out.println("Unsorted & Non Duplicate Data : " + set.toString());
        // list is chosen to sort
        List<CharCount> list = new ArrayList<CharCount>(set);
        Collections.sort(list);
        System.out.println("Sorted Data : " + list.toString());
        Set<CharCount> set1 = new HashSet<CharCount>(list);

        // and show all the unique characters in the input string amd its count

        // size of set should match with the number of unique elements in the input string
        if (list.size() == set.size()) ;
        System.out.println("Set & List size matches");
    }

    @Override
    public int compareTo(CharCount cc1) {
        return Character.valueOf(this.character).compareTo(Character.valueOf(cc1.character));
    }

    @Override
    public String toString() {
        return "CharCount{" +
                "character=" + character +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharCount)) return false;
        CharCount charCount = (CharCount) o;
        return character == charCount.character && count == charCount.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(character, count);
    }

}