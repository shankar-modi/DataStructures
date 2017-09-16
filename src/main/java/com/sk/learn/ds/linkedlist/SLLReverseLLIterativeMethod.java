package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 16/09/17
 */
public class SLLReverseLLIterativeMethod {


    public static void main(String[] args) {
        Node head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        SLLUitility.print(head);

        System.out.println();

        SLLUitility.print(reverseLL(head));
    }

    private static Node reverseLL(Node head) {

        if (head == null || head.getNext() == null) return head;

        Node current = head;
        Node next = null;
        Node previous = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }
}
