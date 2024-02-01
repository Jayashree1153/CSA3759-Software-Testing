import static org.junit.Assert.assertEquals;
import org.junit.*;

public class EX4TEST {

    @Test
    public void testCalculateSimpleInterest() {
        // Test for a regular customer
        assertEquals(1000.0, EX4.calculateSimpleInterest(10000.0, 0.10, 1.0), 0.001);

        // Test for a senior citizen
        assertEquals(1200.0, EX4.calculateSimpleInterest(10000.0, 0.12, 1.0), 0.001);
    }
}