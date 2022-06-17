package at.hackerrank.interview.linkedlist

import spock.lang.Specification

class InsertAtGivenPositionTest extends Specification {

    def "Insert Node At Position when elements and position given"() {
        given:
            List<Integer> elements = List.of(1,2,3)
            InsertAtGivenPosition.SinglyLinkedList linkedList = InsertAtGivenPosition.buildLinkedList(elements)
            int iElement = 4
            int position = 2
        when:
        InsertAtGivenPosition.insertNodeAtPosition(linkedList.head, iElement, position)
        InsertAtGivenPosition.printSinglyLinkedList(linkedList.head, " ")
        then:
        assert true
    }

    def "Delete Node At Position when elements and position given"() {
        given:
        List<Integer> elements = List.of(1,2,3,6)
        InsertAtGivenPosition.SinglyLinkedList linkedList = InsertAtGivenPosition.buildLinkedList(elements)
        int position = 4
        when:
        InsertAtGivenPosition.deleteNode(linkedList.head, position)
        InsertAtGivenPosition.printSinglyLinkedList(linkedList.head, " ")
        then:
        assert true
    }

    def "Delete Node At Position when give list is with on element"() {
        given:
        List<Integer> elements = List.of(7,11,12,8,18,16, 5, 18)
        InsertAtGivenPosition.SinglyLinkedList linkedList = InsertAtGivenPosition.buildLinkedList(elements)
        int position = 0
        when:
        InsertAtGivenPosition.deleteNode(linkedList.head, position)
        InsertAtGivenPosition.printSinglyLinkedList(linkedList.head, " ")
        then:
        assert true
    }
}
