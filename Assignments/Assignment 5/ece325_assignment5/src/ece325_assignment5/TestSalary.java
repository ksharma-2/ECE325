package ece325_assignment5;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestSalary {
    
    @Test
    public void invalidSalary(){
        // Null salary
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(null, 0.0, 0);
        });
        // salary < 0
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(-1.0, 0.0, 0);
        });
        // salary > 1000
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(1001.0, 0.0, 0);
        }); 
    }

    @Test
    public void invalidSnacksAmount(){
        // Null snacksAmount
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(0.0, null, 0);
        });
        // snacksAmount < 0
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(0.0, -1.0, 0);
        });
        // snacksAmount > salary
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(0.0, 1.0, 0);
        });        
    }

    @Test
    public void nullBonus(){
        // Null bonus
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(0.0, 0.0, null);
        });
        // bonus < 0
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(0.0, 0.0, -1);
        });
        // bonus > 10
        assertThrows(IllegalArgumentException.class, () -> {
            Salary.pay(0.0, 0.0, 11);
        });     
    }

    @Test
    public void validEntry(){
        // All entries are valid, and return the intended amount, with a delta of 0.001
        assertEquals(60.0, Salary.pay(100.0, 50.0, 10), 0.001);
        assertEquals(110.0, Salary.pay(100.0, 0.0, 10), 0.001);
        assertEquals(50, Salary.pay(100.0, 50.0, 0), 0.001);
        assertEquals(0.0, Salary.pay(0.0, 0.0, 0), 0.001);
    }
}
