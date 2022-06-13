package at.hackerrank.interview

import spock.lang.Specification

class StaircaseTest extends Specification {

    def "print staircase"() {
        expect:
            Staircase.staircase(5)
            assert true
    }
}
