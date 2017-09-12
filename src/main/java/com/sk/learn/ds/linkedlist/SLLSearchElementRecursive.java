package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 12/09/17
 */
public class SLLSearchElementRecursive {

    private static Node head;

    public static void main(String[] args) {
        head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        System.out.println(searchRecursive(head,3));

    }

    private static boolean searchRecursive(Node head,int element) {

        if(head == null)return  false;

        if(head.getData() == element)return true;

        return searchRecursive(head.getNext(),element);

    }
}
