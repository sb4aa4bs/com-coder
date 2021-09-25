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

    public static ListNode addTwoNumbersSol1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
        //return curr.next; // returns NPE
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3, new ListNode())));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode())));
        System.out.println("Node 1: " + node1.toString());
        System.out.println("Node 2: " + node2.toString());
        //addTwoNumbers(node1, node2);
        ListNode resultNode = addTwoNumbersSol1(node1, node2);
        System.out.println("Final Result : " + resultNode.toString());
    }

    public ListNode addTwoNumbersSol2(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode emptyNode = new ListNode(0);
        ListNode currentNode = new ListNode(0);
        ListNode result = currentNode;
        while (emptyNode != l1 || emptyNode != l2) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            currentNode = (currentNode.next = new ListNode(sum %= 10));
            l1 = null != l1.next ? l1.next : emptyNode;
            l2 = null != l2.next ? l2.next : emptyNode;
        }
        if (carry == 1)
            currentNode.next = new ListNode(carry);
        return result.next;
    }

}
