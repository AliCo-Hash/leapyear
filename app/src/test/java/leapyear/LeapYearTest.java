package leapyear;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void testDivisibleby4() {
        assertTrue("Year divisible by 400 is a leap year", checkLeapYear(2000));
    }
}
