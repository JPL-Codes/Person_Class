import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker p1;

    @BeforeEach
    void setUp() {
        p1 = new Worker("Greg", "Nord", "000004", "Sr", 1988);
    }

    @Test
    void calculateWeeklyPay() {
        p1.calculateWeeklyPay(1);
        assertEquals(8.0,p1.calculateWeeklyPay(1));
    }

    @Test
    void displayWeeklyPay() {
        p1.displayWeeklyPay(1);
        assertEquals("8.0",p1.displayWeeklyPay(1));
    }

    @Test
    void setHourlyPayRate() {
        p1.setHourlyPayRate(10);
        assertEquals(10,p1.getHourlyPayRate());
    }

    @Test
    void setShift() {
        p1.setShift(30);
        assertEquals(30,p1.getShift());
    }
}