package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 11/09/17
 */
public class SLLInsertAtFront {

    static private Node head ;

    public static void main(String[] args) {
         int[] data = new int[] {1, 2, 3, 4, 5};

         head = SLLUitility.createLinkedLIst(data);

         insertAtFront(6);

        SLLUitility.print(head);
    }

    private static void insertAtFront(int data) {

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }
}
