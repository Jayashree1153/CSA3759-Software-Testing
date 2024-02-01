import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EX3TEST {

    @Test
    public void testEligibleToVote() {
        assertTrue(EX3.isEligibleToVote(18));
        assertTrue(EX3.isEligibleToVote(25));
        assertTrue(EX3.isEligibleToVote(50));

        // Add more test cases for eligible ages
    }

    @Test
    public void testNotEligibleToVote() {
        assertFalse(EX3.isEligibleToVote(17));
        assertFalse(EX3.isEligibleToVote(14));
        assertFalse(EX3.isEligibleToVote(10));

        // Add more test cases for non-eligible ages
    }
}