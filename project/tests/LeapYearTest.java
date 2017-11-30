import org.junit.Test;

import static org.junit.Assert.*;

// JUnit тесты
public class LeapYearTest {
    @Test
    public void isLeapYear1() throws Exception {
        // проверяем 2017
        boolean result = LeapYear.isLeapYear(2017);
        // он должен быть false
        assertEquals(false, result);
    }

    @Test
    public void isLeapYear2() throws Exception {
        // проверяем 2016
        boolean result = LeapYear.isLeapYear(2016);
        // он должен быть true
        assertEquals(true, result);
    }
}