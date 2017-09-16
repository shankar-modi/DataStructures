package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 11/09/17
 */
public class SLLUitility {

    public static Node head;

    public static Node createLinkedLIst(int[] data){

        for (int i=0; i<data.length; i++) addNodeToList(data[i]);

        return  head;

    }

    private static void addNodeToList(int data) {

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);

    }

    public static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData() + " -- > ");
            temp = temp.getNext();

        }
    }

    public static int lenght(Node head){
        if(head == null)return  -1;

        Node temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.getNext();
            length++;
        }

        return length;
    }
}
