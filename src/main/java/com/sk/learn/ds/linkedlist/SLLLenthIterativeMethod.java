package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 16/09/17
 */
public class SLLLenthIterativeMethod {

    public static void main(String[] args) {
        Node head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        int length = findLenghtOfLinkedList(head);

        System.out.println("Length of the linkedlist : " + length);

    }

    private static int findLenghtOfLinkedList(Node head) {

        if (head == null) return 0;

        int count = 1;
        Node temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
            count++;
        }

        return count;

    }
}
