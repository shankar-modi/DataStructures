package com.sk.learn.ds.linkedlist;

/**
 * @author shankarmodi
 * 16/09/17
 */
public class SLLSwapNodes {

    static Node head;

    public static void main(String[] args) {
        head = SLLUitility.createLinkedLIst(new int[]{10, 15, 12, 13, 20, 14});

        SLLUitility.print(head);

        swapNodes(10, 14);
        System.out.println();

        SLLUitility.print(head);
    }

    private static void swapNodes(int x, int y) {

        if (x == y) return;

        Node xprev = null;
        Node xcurr = head;

        while (xcurr != null && xcurr.getData() != x) {
            xprev = xcurr;
            xcurr = xcurr.getNext();
        }

        Node yprev = null;
        Node ycurr = head;

        while (ycurr != null && ycurr.getData() != y) {
            yprev = ycurr;
            ycurr = ycurr.getNext();
        }

        if (ycurr == null || xcurr == null) return;


        if (xprev != null) {
            xprev.setNext(ycurr);
        } else {
            head = ycurr;
        }

        if (yprev != null) {
            yprev.setNext(xcurr);
        } else {
            head = xcurr;
        }

        //Swapping the nodes.

        Node ynext = ycurr.getNext();
        ycurr.setNext(xcurr.getNext());
        xcurr.setNext(ynext);


    }
}
