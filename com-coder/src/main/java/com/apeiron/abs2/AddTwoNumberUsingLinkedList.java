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
        ListNode resultNode = new ListNode();
        ListNode ln1 = l1, ln2 = l2;
        System.out.println("LinkedList1: " + l1.getVal() + l1.getNext().getVal() + l1.getNext().getNext().getVal());
        System.out.println("LinkedList2: " + l2.getVal() + l2.getNext().getVal() + l2.getNext().getNext().getVal());
        while (ln1 != null && ln2 != null) {
            System.out.println("L1 : " + ln1.getVal());
            System.out.println("L2 : " + ln2.getVal());
            ln1 = ln1.next;
            ln2 = ln2.next;
        }
        ListNode result = new ListNode();

        return resultNode;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3, new ListNode())));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode())));
        System.out.println("Node 1: " + node1.toString());
        System.out.println("Node 2: " + node2.toString());
        addTwoNumbers(node1, node2);
    }

}
