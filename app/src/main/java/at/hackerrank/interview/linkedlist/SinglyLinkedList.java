package at.hackerrank.interview.linkedlist;

import java.util.List;

public class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
        System.out.println("");
    }

    public static SinglyLinkedList buildLinkedList(List<Integer> elements) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        elements.forEach(singlyLinkedList::insertNode);
        return singlyLinkedList;
    }
}
