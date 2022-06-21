package at.hackerrank.interview.linkedlist;

public class CompareLists {

    public static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null || head2 == null){
            return false;
        }
        int listSize1 = getListSize(head1);
        int listSize2 = getListSize(head2);
        if(listSize1 != listSize2){
            return false;
        }else{
            return matchList(head1, head2);
        }
    }

    private static boolean matchList(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode cNode = head1;
        SinglyLinkedListNode bNode = head2;
        boolean isMatch = true;
        while (cNode.next != null){
            cNode = cNode.next;
            bNode = bNode.next;
            if(cNode.data != bNode.data){
                isMatch = false;
                break;
            }
        }
        return isMatch;
    }

    private static int getListSize(SinglyLinkedListNode head) {
        SinglyLinkedListNode cNode = head;
        int listSize = 0;
        while(cNode.next != null){
            cNode = cNode.next;
            listSize++;
        }
        return listSize;
    }
}
