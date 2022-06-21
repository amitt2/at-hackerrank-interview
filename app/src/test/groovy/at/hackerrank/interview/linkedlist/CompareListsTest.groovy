package at.hackerrank.interview.linkedlist

import spock.lang.Specification

class CompareListsTest extends Specification {

    def "CompareLists when list are same length and same elements"() {
        given:
        SinglyLinkedList list1 = SinglyLinkedList.buildLinkedList(List.of(9,7,5,2))
        SinglyLinkedList list2 = SinglyLinkedList.buildLinkedList(List.of(9,7,5,2))
        when:
            boolean isMatch = CompareLists.compareLists(list1.head, list2.head)
        then:
        isMatch
    }

    def "CompareLists when list are diff length and same elements"() {
        given:
        SinglyLinkedList list1 = SinglyLinkedList.buildLinkedList(List.of(9,7,5,2))
        SinglyLinkedList list2 = SinglyLinkedList.buildLinkedList(List.of(9,7,5))
        when:
        boolean isMatch = CompareLists.compareLists(list1.head, list2.head)
        then:
        !isMatch
    }

    def "CompareLists when list are same length and diff elements"() {
        given:
        SinglyLinkedList list1 = SinglyLinkedList.buildLinkedList(List.of(9,7,5,2))
        SinglyLinkedList list2 = SinglyLinkedList.buildLinkedList(List.of(9,7,5,4))
        when:
        boolean isMatch = CompareLists.compareLists(list1.head, list2.head)
        then:
        !isMatch
    }

    def "CompareLists when one list is empty"() {
        given:
        SinglyLinkedList list2 = SinglyLinkedList.buildLinkedList(List.of(9,7,5,4))
        when:
        boolean isMatch = CompareLists.compareLists(null, list2.head)
        then:
        !isMatch
    }
}
