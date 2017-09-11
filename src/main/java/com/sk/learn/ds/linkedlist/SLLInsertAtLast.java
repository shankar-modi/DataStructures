package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 11/09/17
 */
public class SLLInsertAtLast {

    private static Node head;

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};

        head = SLLUitility.createLinkedLIst(data);

        insertAtLast(6);

        SLLUitility.print(head);


    }

    private static void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
    }
}
