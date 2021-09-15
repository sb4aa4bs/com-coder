package com.apeiron.abs2;

public class LongCommonPrefix {

    static String[] data = new String[]{"flounder", "flour", "flowing"};

    public static void main(String[] args) {
        new LongCommonPrefix().longestCommonPrefix(data);
        //new LongCommonPrefix().indexof();
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            System.out.println(strs[i] + " compared with " + prefix + " Index is " + strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0) { // reduce the prefix content by length-1, until prefix finds a
                // match, equal to 0 means typically a match found
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println("& the new destination is " + prefix);
                if (prefix.isEmpty()) { // if prefix gets reduced to empty before a match is found return empty string
                    System.out.println("Skipping comparison");
                    return "";
                } // end of if
            } // end of while
        } // end for for
        System.out.println("Final Result : " + prefix);
        return prefix;
    }

    public void indexof() {
        String source = null;
        //source = "Apple Pear Strawberry Grape Mangoes";
        source = "Incredible India";
        String dest = null;
//      dest = mango;
        dest = "In";
        System.out.println("Source :[" + source + "] ---- Destination : [" + dest + "]");
        int startLocation = source.indexOf(dest);
        if (startLocation != -1) {
            System.out.println("Appears at the index position " + startLocation + ".");
        } else {
            System.out.println("Not in the specified string.");
        }
    }
}
