package com.sk.learn.ds.linkedlist;

import com.sun.tools.corba.se.idl.constExpr.Not;

/**
 * @author shankarmodi
 * 12/09/17
 */
public class SLLDeleteFromEnd {
    private static Node head;

    public static void main(String[] args) {
        head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        System.out.println("Before Delete");
        SLLUitility.print(head);

        deleteFromEnd();

        System.out.println("\n After Delete");

        SLLUitility.print(head);
    }

    private static void deleteFromEnd() {

        if(head == null || head.getNext()==null){
            head=null;
            return;
        }

        Node temp = head;
        while(temp.getNext().getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(null);
    }
}
