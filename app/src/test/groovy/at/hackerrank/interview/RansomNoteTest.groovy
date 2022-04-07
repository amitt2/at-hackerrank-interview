package at.hackerrank.interview

import spock.lang.Specification

class RansomNoteTest extends Specification {

    def "check ransom notes"() {
        given:
            String magazine = "give me one grand today night"
            String note = "give one grand today"
            String result = RansomNote.checkMagazine(Arrays.asList(magazine.split()), Arrays.asList(note.split()))
        expect:
            result=="NO"
    }

    def "check ransom notes when magazine is null"(){
        given:
            String result = RansomNote.checkMagazine(null, null)
        expect:
            result == "NO"
    }

}
