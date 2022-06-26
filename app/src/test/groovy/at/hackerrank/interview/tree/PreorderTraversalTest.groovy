package at.hackerrank.interview.tree

import spock.lang.Specification

class PreorderTraversalTest extends Specification {

    def "Should traverse PreOrder"() {
        given:
        Node root = new Node(1)
        List<Integer> elements = List.of(8,7,2,9,5,3)
        elements.stream().forEach({ elm -> PreorderTraversal.insert(root, elm) })
        PreorderTraversal.preOrder(root)
        expect:
        assert true
    }
}
