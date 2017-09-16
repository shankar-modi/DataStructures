package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 16/09/17
 */
public class SLLReverseLLRecursiveMethod {


    public static void main(String[] args) {

        Node head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        SLLUitility.print(head);

        System.out.println();

        SLLUitility.print(reverseLL(head, null));
    }

    private static Node reverseLL(Node current, Node previous) {
        Node head = null;
        if (current == null) return null;

        if (current.getNext() == null) {
            head = current;
            current.setNext(previous);
            return head;
        }

        Node next = current.getNext();

        current.setNext(previous);

        return (reverseLL(next, current));

    }
}
