package leapyear;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void testNotDivisibleby4() {
        LeapYear lP = new LeapYear();
        assertFalse("Year not divisible by 4 is not a leap year", lP.checkLeapYear(2005));
    }

    @Test
    public void testDivisibleby400() {
        LeapYear lP = new LeapYear();
        assertTrue("Year divisible by 400 is a leap year", lP.checkLeapYear(1600));
    }
}
