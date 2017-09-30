package com.sk.learn.ds.linkedlist;

import java.util.Arrays;

/**
 * @author shankarmodi
 * 29/09/17
 */
public class SLLDetectLoop {

    public static Node head;

    public static void main(String[] args) {
        head = getLinkedLIst(new int[]{1, 2, 3, 4, 5});


        boolean loop = detectLoop(head);
        System.out.println("Loop detected ? " + loop);
    }

    private static boolean detectLoop(Node head) {

        if (head == null || head.getNext() == null) return false;

        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    private static Node getLinkedLIst(int[] list) {

        if (list == null || list.length == 0) return null;

        Node head = null;
        Node tmp = null;
        for (int item : list) {
            if (head == null) {
                head = new Node(item);
            } else {
                Node newNode = new Node(item);
                newNode.setNext(head);
                head = newNode;
            }


        }

        head.getNext().getNext().getNext().getNext().setNext(head.getNext().getNext());

        return head;

    }
}
