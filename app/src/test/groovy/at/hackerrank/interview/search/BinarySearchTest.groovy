package at.hackerrank.interview.search

import spock.lang.Specification

class BinarySearchTest extends Specification {

    def "search when element on left side"() {
        given:
        int[] array = [5, 9, 3, 9, 19, 6, 12, 8]
        int left = 0
        int right = 7
        when:
        boolean isFound = BinarySearch.recursiveSearch(array, 6, left, right)
        then:
        isFound
    }

    def "search iterative when element on left side"() {
        given:
        int[] array = [5, 9, 3, 9, 19, 6, 12, 8]
        when:
        boolean isFound = BinarySearch.iterativeSearch(array, 6)
        then:
        isFound
    }
}
