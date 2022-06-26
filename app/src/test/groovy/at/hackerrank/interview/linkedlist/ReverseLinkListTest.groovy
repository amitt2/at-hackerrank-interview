package at.hackerrank.interview.linkedlist

import spock.lang.Specification

class ReverseLinkListTest extends Specification {
    def "Reverse give link list and return head node"() {
        given:
        SinglyLinkedList linkedList = SinglyLinkedList.buildLinkedList(List.of(1,2,3,4,5))
        when:
            SinglyLinkedListNode head = ReverseLinkList.reverse(linkedList.head)
            SinglyLinkedList.printSinglyLinkedList(head, " ")
        then:
            head != null
            head.data == 5
    }

    def "Print in reverse give link list and return head node"() {
        given:
        SinglyLinkedList linkedList = SinglyLinkedList.buildLinkedList(List.of(1,2,3,4,5))
        when:
        SinglyLinkedListNode head = ReverseLinkList.reverse(linkedList.head)
        SinglyLinkedList.printSinglyLinkedList(head, " ")
        then:
        head != null
        head.data == 5
    }
}
