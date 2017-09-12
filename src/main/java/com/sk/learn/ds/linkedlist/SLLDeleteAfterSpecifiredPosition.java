package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 12/09/17
 */
public class SLLDeleteAfterSpecifiredPosition {

    private static Node head;

    public static void main(String[] args) {
        head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        System.out.println("Before Delete");

        SLLUitility.print(head);

        deleteAfterSpecifiedPosition(4);

        System.out.println("\n After Delete");

        SLLUitility.print(head);
    }

    private static void deleteAfterSpecifiedPosition(int position) {

        int count = 1;

        if(head == null || head.getNext() == null){
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;

        while(temp.getNext() != null && count != position){
            prev = temp;
            temp = temp.getNext();
            count++;
        }

        if(prev != null)prev.setNext(temp.getNext());




    }
}
