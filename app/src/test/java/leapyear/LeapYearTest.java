package leapyear;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void testDivisibleby4() {
        LeapYear lP = new LeapYear();
        assertTrue("Year divisible by 400 is a leap year", lP.checkLeapYear(2000));
    }
}
