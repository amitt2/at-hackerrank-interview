package at.hackerrank.interview.linkedlist

import spock.lang.Specification

class GetNodeValueTest extends Specification {

    def "GetNode"() {
        given:
        List<Integer> elements = List.of(1,2,3,6)
        SinglyLinkedList linkedList = SinglyLinkedList.buildLinkedList(elements)
        int positionFromTail = 2
        when:
        int value = GetNodeValue.getNode(linkedList.head, positionFromTail)
        SinglyLinkedList.printSinglyLinkedList(linkedList.head, " ")
        then:
        value == 2
    }

    def "GetNode when list has only one element"() {
        given:
        List<Integer> elements = List.of(1)
        SinglyLinkedList linkedList = SinglyLinkedList.buildLinkedList(elements)
        int positionFromTail = 0
        when:
        int value = GetNodeValue.getNode(linkedList.head, positionFromTail)
        SinglyLinkedList.printSinglyLinkedList(linkedList.head, " ")
        then:
        value == 1
    }

    def "GetNode when list is empty element"() {
        given:
        List<Integer> elements = List.of()
        SinglyLinkedList linkedList = SinglyLinkedList.buildLinkedList(elements)
        int positionFromTail = 4
        when:
        int value = GetNodeValue.getNode(linkedList.head, positionFromTail)
        SinglyLinkedList.printSinglyLinkedList(linkedList.head, " ")
        then:
        value == 0
    }
}
