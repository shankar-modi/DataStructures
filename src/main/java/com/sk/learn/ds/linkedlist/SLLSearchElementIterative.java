package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 12/09/17
 */
public class SLLSearchElementIterative {

    private static Node head;

    public static void main(String[] args) {
        head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

         System.out.println(searchIterative(10));

    }

    private static boolean searchIterative(int element) {

        if(head == null)return  false;

        Node temp = head;

        while(temp.getNext() != null){
            if(temp.getData() == element)return true;

            temp = temp.getNext();
        }

        return false;

    }
}
