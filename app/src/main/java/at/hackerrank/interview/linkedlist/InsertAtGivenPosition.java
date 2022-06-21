package at.hackerrank.interview.linkedlist;

public class InsertAtGivenPosition {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        if (llist == null) {
            return llist;
        }
        SinglyLinkedListNode cNode = llist;
        int currPos = 0;
        while (currPos < position - 1) {
            cNode = cNode.next;
            currPos++;
        }
        System.out.println("currData " + cNode.data + " pos " + currPos);
        SinglyLinkedListNode nNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode tNode = cNode.next;
        cNode.next = nNode;
        nNode.next = tNode;
        return llist;
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here
        if (llist == null) {
            return null;
        }
        int currPos = 0;
        SinglyLinkedListNode cNode = llist;
        if (position == 0) {
            SinglyLinkedListNode tNode = cNode.next;
            llist.next = null;
            return tNode;
        }
        while (cNode.next != null && currPos < position - 1) {
            cNode = cNode.next;
            currPos++;
        }
        if (cNode.next != null) {
            SinglyLinkedListNode dNode = cNode.next;
            cNode.next = dNode.next;
        } else {
            return null;
        }
        return llist;
    }
}
