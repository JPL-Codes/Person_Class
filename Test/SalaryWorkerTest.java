import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker p1;

    @BeforeEach
    void setUp() {

        p1 = new SalaryWorker("Greg", "Nord", "000004", "Sr", 1988);

    }

    @Test
    void calculateWeeklyPay() {
        p1.calculateWeeklyPay(1);
        assertEquals(0.0,p1.calculateWeeklyPay(1));
    }

    @Test
    void displayWeeklyPay() {
        p1.displayWeeklyPay(1);
        assertEquals("0.0",p1.displayWeeklyPay(1));
    }

    @Test
    void setAnnualSalary() {
        p1.setAnnualSalary(72000);
        assertEquals(72000, p1.getAnnualSalary());
    }
}