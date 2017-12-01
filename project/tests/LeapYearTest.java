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

    @Test
    public void isLeapYear3() throws Exception {
        // проверяем 1600
        boolean result = LeapYear.isLeapYear(1600);
        // он должен быть true
        assertEquals(true, result);
    }

    @Test
    public void isLeapYear4() throws Exception {
        // проверяем 1900
        boolean result = LeapYear.isLeapYear(1900);
        // он должен быть false
        assertEquals(false, result);
    }
}