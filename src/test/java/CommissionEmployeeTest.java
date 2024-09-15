import EmployeeObjects.CommissionEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommissionEmployeeTest {
    private CommissionEmployee emp;

    @BeforeEach
    public void setup() {
        emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
    }

    @Test
    public void testIncreaseSales() {
        double sales = emp.getSales();
        emp.increaseSales();
        assertTrue(emp.getSales() > sales);

        sales = emp.getSales();
        emp.increaseSales(5.0);
        assertTrue(emp.getSales() > sales);

        sales = emp.getSales();
        emp.increaseSales(-5.0);
        assertEquals(sales, emp.getSales());
    }

    @Test
    public void testHolidayBonus() {
        assertEquals(0.0, emp.holidayBonus());
    }

    @Test
    public void testAnnualRaise() {
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate());
    }
}
