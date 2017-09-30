package com.sk.learn.ds.dll;

/**
 * @author shankarmodi
 * 30/09/17
 */
public class DLLUtility {

    public static void print(Node head){

        if(head == null)return;

        Node temp = head;

        while(temp != null){
            System.out.print(temp.getData() + " ->");
            temp = temp.getNext();
        }

    }

    public static int length(Node head){
        int count = 0;

        if(head == null) return  count;

        Node temp = head;
        count ++;

        while (temp.getNext() != null){
            count++;
            temp = temp.getNext();
        }

        return count;
    }
}
