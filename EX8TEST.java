import static org.junit.Assert.*;
import org.junit.Test;

public class EX8TEST {

    @Test
    public void testCalculateFactorial() {
        EX8 calculator = new EX8();

        assertEquals(24, calculator.calculateFactorial(4)); 
        assertEquals(120, calculator.calculateFactorial(5)); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialNegativeInput() {
        EX8 calculator = new EX8();
        calculator.calculateFactorial(-1);
    }
}