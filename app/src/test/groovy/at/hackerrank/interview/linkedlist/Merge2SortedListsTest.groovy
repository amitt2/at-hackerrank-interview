package at.hackerrank.interview.linkedlist

import spock.lang.Specification

class Merge2SortedListsTest extends Specification {

    def "MergeLists when two list of same length"() {
        given:
        SinglyLinkedList list1 = SinglyLinkedList.buildLinkedList(List.of(1, 4, 5, 7))
        SinglyLinkedList list2 = SinglyLinkedList.buildLinkedList(List.of(1, 4, 5, 7))
        when:
        SinglyLinkedListNode head = Merge2SortedLists.mergeLists(list1.head, list2.head)
        SinglyLinkedList.printSinglyLinkedList(head, " ")
        then:
        head != null
    }
}
