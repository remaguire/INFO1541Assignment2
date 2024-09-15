import EmployeeObjects.SalaryEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SalaryEmployeeTest {
    private SalaryEmployee emp;

    @BeforeEach
    public void setup() {
        emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
    }

    @Test
    public void testCalculateWeeklyPay() {
        assertEquals(1237.02, emp.calculateWeeklyPay());
    }

    @Test
    public void testHolidayBonus() {
        assertEquals(2164.54, emp.holidayBonus());
    }
}
