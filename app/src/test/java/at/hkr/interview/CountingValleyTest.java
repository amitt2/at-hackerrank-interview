package at.hkr.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CountingValleyTest {

    CountingValley countingValley;

    @Before
    void setUp(){
        countingValley = new CountingValley();
    }

    @Test
    public void testCountingValleys() {
        int valleyCount = countingValley.countingValleys(8, "DDUUUUDD");
        assertEquals(1, valleyCount);
    }
}
