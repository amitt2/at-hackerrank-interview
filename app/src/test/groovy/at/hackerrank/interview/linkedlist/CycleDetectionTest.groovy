package at.hackerrank.interview.linkedlist

import spock.lang.Specification

class CycleDetectionTest extends Specification {
    def "should return true when list has cycle"() {
        given:
        List<Integer> elements = List.of(1,2,3,6,2)
        SinglyLinkedList linkedList = SinglyLinkedList.buildLinkedList(elements)
        when:
            boolean hasCycle = CycleDetection.hasCycle(linkedList.head)
        then:
        hasCycle
    }

    def "should return false when list doesn't has cycle"() {
        given:
        List<Integer> elements = List.of(1,2,3,6)
        SinglyLinkedList linkedList = SinglyLinkedList.buildLinkedList(elements)
        when:
        boolean hasCycle = CycleDetection.hasCycle(linkedList.head)
        then:
        !hasCycle
    }
}
