package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 12/09/17
 */
public class SLLInsertAfterSpecifiedPosition {

    private static Node head;

    public static void main(String[] args) {

        head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6});

        insertAfterSpecifiedPosition(10, 7);

        SLLUitility.print(head);

    }

    private static void insertAfterSpecifiedPosition(int position, int data) {
        Node newNode = new Node(data);
        int count = 1;

        if (head == null) {
            head = newNode;
            return;
        }

        if (position == 0) {
            newNode.setNext(head);
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.getNext() != null && count != position) {
            temp = temp.getNext();
            count++;
        }

        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }
}
