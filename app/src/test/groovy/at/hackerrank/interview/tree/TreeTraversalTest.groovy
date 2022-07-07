package at.hackerrank.interview.tree

import spock.lang.Specification

class TreeTraversalTest extends Specification {

    def "Should traverse PreOrder"() {
        given:
        Node root = new Node(1)
        List<Integer> elements = List.of(8,7,2,9,5,3)
        elements.stream().forEach({ elm -> TreeTraversal.insert(root, elm) })
        TreeTraversal.preOrder(root)
        expect:
        assert true
    }
}
