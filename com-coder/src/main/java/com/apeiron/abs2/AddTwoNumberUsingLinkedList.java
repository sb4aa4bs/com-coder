package com.apeiron.abs2;

import lombok.Data;

@Data
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumberUsingLinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();

        return node;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3, new ListNode())));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode())));
        System.out.println("Node 1: " + node1.toString());
        System.out.println("Node 2: " + node2.toString());
        addTwoNumbers(node1, node2);
    }

}
