package at.hackerrank.interview

import spock.lang.Specification

class RansomNoteTest extends Specification {

    def "check ransom notes"() {
        given:
            String result = RansomNote.checkMagazine()
        expect:
            result=='NO'
    }

}
