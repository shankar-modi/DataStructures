package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 16/09/17
 */
public class SLLMiddleElementOfLL {

    static Node head;

    public static void main(String[] args) {
        head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        findMiddleElement(head);
    }

    private static void findMiddleElement(Node head) {
        if (head == null) return;

        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }

        System.out.println(slowPtr.getData());

    }
}
