package at.hackerrank.interview.linkedlist;

public class Merge2SortedLists {
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        if(head1 == null && head2 == null){
            return null;
        }
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        SinglyLinkedListNode cNode1 = head1;
        while(cNode1.next != null){
            cNode1 = cNode1.next;
            mergedList.insertNode(cNode1.data);
        }
        return mergedList.head;
    }
}
