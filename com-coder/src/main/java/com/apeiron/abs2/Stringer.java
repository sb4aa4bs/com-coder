package com.apeiron.abs2;

//- eg. Order = ‘sitgo’.  Input String = ‘thisisalongstring’.output will be ‘sssiiittggohalnr’

public class Stringer {


    static String input = "thisisalongstring";
    static String pref = "sitgo";

    public static void main(String[] args) {
        String output = "";
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < pref.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (pref.charAt(i) == input.charAt(j)) {
                    str.append(pref.charAt(i));

                } else {
                    if (pref.indexOf(input.charAt(j)) == -1 && str1.indexOf(String.valueOf(input.charAt(j))) == -1) {
                        str1.append(input.charAt(j));
                    }

                }

            }
        }
        output = str.toString() + str1.toString();
        System.out.println("Final Output " + output);
    }
}
