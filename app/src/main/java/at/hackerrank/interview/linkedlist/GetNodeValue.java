package at.hackerrank.interview.linkedlist;

public class GetNodeValue {

    public static int getNode(SinglyLinkedListNode hNode, int positionFromTail) {
        // Write your code here
        if(hNode == null){
            return 0;
        }
        SinglyLinkedListNode cNode = hNode;
        int lastIndex = 0;
        while (cNode.next != null) {
            cNode = cNode.next;
            lastIndex++;
        }
        int positionFromHead = lastIndex - positionFromTail;
        SinglyLinkedListNode eNode = hNode;
        for (int i = 0; i < positionFromHead; i++) {
            if (eNode != null) {
                eNode = eNode.next;
            }
        }
        if (eNode == null) {
            return 0;
        } else {
            return eNode.data;
        }
    }
}
