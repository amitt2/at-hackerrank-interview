package at.hackerrank.interview.linkedlist;
//1->2->3->4->5
//1<-2<-3<-4<-5
public class ReverseLinkList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head){
        SinglyLinkedListNode curr,prev,next;
        curr = head;
        prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
