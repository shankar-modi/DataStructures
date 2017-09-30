package com.sk.learn.ds.dll;

/**
 * @author shankarmodi
 * 30/09/17
 */
public class DLLInsertAtBegin {

    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegin(head , 1);
        head = insertAtBegin(head , 2);
        head = insertAtBegin(head , 3);
        DLLUtility.print(head);
        System.out.println();
        System.out.println("Length : "+DLLUtility.length(head));
    }

    private static Node insertAtBegin(Node head, int data) {

        if(head == null){
            head = new Node(data);
            return head;
        }

        Node newNode = new Node(data);
        newNode.setNext(head);
        head.setPrev(newNode);
        head = newNode;

        return head;


    }
}
