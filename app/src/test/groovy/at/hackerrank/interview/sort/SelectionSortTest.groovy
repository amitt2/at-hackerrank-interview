package at.hackerrank.interview.sort

import spock.lang.Specification

class SelectionSortTest extends Specification {
    def "SelectionSort"() {
        given:
            int[] input = [2,9,1,6,1,7,4]
        when:
        SelectionSort.printElements(input)
        SelectionSort.selectionSort(input, input.length)
        System.out.println("")
        SelectionSort.printElements(input)
        then:
          assert true
    }
}
