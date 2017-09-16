package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 16/09/17
 */
public class SLLGetNthNode {

    static Node head;
    public static void main(String[] args) {
         head = SLLUitility.createLinkedLIst(new int[]{1, 2, 3, 4, 5});

        int node = getNthNode(4);

        System.out.println("Nth node at index : " + node);
    }

    private static int getNthNode(int index) {
        if(index < 0) throw new RuntimeException("Index should be non negative number");
        if(index > (SLLUitility.lenght(head) -1 ))throw new RuntimeException("IndexoutOfBound");

        Node temp = head;
        int currentIndex = 0;

        while (temp != null && currentIndex != index){
            temp=temp.getNext();
            currentIndex++;
        }


        return temp.getData();

    }
}
