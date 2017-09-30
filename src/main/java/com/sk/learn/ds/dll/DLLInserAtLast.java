package com.sk.learn.ds.dll;

/**
 * @author shankarmodi
 * 30/09/17
 */
public class DLLInserAtLast {

    public static void main(String[] args) {
        Node head = null;

        head = insertAtLast(head, 1);
        head = insertAtLast(head, 2);
        head = insertAtLast(head, 3);

        DLLUtility.print(head);
        System.out.println();
        System.out.println("Length : "+DLLUtility.length(head));
    }

    private static Node insertAtLast(Node head, int data) {

        if(head == null){
            head = new Node(data);

            return  head;
        }

        Node temp = head;
        Node newNode = new Node(data);

        while (temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(newNode);
        newNode.setPrev(temp);


        return head;
    }
}
