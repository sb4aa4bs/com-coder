package com.apeiron.abs2;

import java.util.LinkedList;

public class LinkedLinkDiveIn {

    /*
    Properties of LinkedList:
    1) Can be accesses only sequentially
    2)
    */

    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList();
        llist.add("Second");
        llist.add("First");
        llist.add(1, "Sneakedin");
        llist.add(0, "in between");
        //llist.add(-1, "beginning");
        System.out.println("LinkedList Data : " + llist.toString());
        String[] str = new String[1];
        //System.out.println(str[-1]);
    }
}
