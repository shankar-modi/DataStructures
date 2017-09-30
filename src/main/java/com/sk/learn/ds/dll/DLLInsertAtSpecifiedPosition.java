package com.sk.learn.ds.dll;

import sun.jvm.hotspot.debugger.windbg.DLL;

/**
 * @author shankarmodi
 * 30/09/17
 */
public class DLLInsertAtSpecifiedPosition {

    public static void main(String[] args) {

        Node head = null;
        head = getList(head, new int[]{1,2,3,4});

        DLLUtility.print(head);
        System.out.println();
        System.out.println(DLLUtility.length(head));

        head = insertAtSpecifiedPosition(head, 5, 1);

        DLLUtility.print(head);
        System.out.println();
        System.out.println(DLLUtility.length(head));

    }

    private static Node insertAtSpecifiedPosition(Node head, int data, int position) {

        if(position <= 1){
            return getList(head, new int[]{data});
        }

        if(position >= DLLUtility.length(head))throw new RuntimeException("Specified position should be less than length of DLL");

        Node temp = head;
        int counter = 1;

        while (temp != null && counter != position){
            temp = temp.getNext();
            counter++;
        }

        Node newNode = new Node(data);
        newNode.setNext(temp.getNext());
        newNode.setPrev(temp);
        temp.setNext(newNode);
        temp.getNext().getNext().setPrev(newNode);
        return head;
    }

    private static Node getList(Node head, int[] dataArr) {

        for (int data: dataArr) {

            if(head == null){
                head = new Node(data);
            }else{
                Node newNode = new Node(data);
                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            }

        }

        return head;
    }
}
