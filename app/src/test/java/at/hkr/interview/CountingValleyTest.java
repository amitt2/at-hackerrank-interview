package at.hkr.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountingValleyTest {

    CountingValley countingValley;

    @BeforeEach
    void setUp(){
        countingValley = new CountingValley();
    }

    @Test
    public void testCountingValleys() {
        int valleyCount = countingValley.countingValleys(8, "DDUUUUDD");
        assertEquals(1, valleyCount);
    }
}
