import EmployeeObjects.HourlyEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HourlyEmployeeTest {
    private HourlyEmployee emp;

    @BeforeEach
    public void setup() {
        emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
    }

    @Test
    public void testIncreaseHours() {
        double hours = emp.getHoursWorked();
        emp.increaseHours();
        assertTrue(emp.getHoursWorked() > hours);

        hours = emp.getHoursWorked();
        emp.increaseHours(5.0);
        assertTrue(emp.getHoursWorked() > hours);

        hours = emp.getHoursWorked();
        emp.increaseHours(-5.0);
        assertEquals(hours, emp.getHoursWorked());
    }

    @Test
    public void testAnnualRaise() {
        emp.annualRaise();
        assertEquals(34.49, emp.getWage());
    }

    @Test
    public void testCalculateWeeklyPay1() {
        emp.increaseHours(35.0);
        assertEquals(1149.75, emp.calculateWeeklyPay());
    }

    @Test
    public void testCalculateWeeklyPay2() {
        emp.increaseHours(45.0);
        assertEquals(1560.38, emp.calculateWeeklyPay());
    }
}
