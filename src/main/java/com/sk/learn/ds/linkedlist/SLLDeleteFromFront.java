package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 12/09/17
 */
public class SLLDeleteFromFront {

    private static Node head;

    public static void main(String[] args) {
        head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("Before Delete");
        SLLUitility.print(head);
        deleteNodeFromFront();
//        deleteNodeFromFront();
//        deleteNodeFromFront();
//        deleteNodeFromFront();
        System.out.println("\nAfter Delete");
        SLLUitility.print(head);
    }

    private static void deleteNodeFromFront() {

        if (head == null || head.getNext() == null) {
            head = null;
            return;
        }

        head = head.getNext();


    }
}
