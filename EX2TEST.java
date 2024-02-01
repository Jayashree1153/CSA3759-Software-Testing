import org.junit.Test;
import static org.junit.Assert.*;

public class EX2TEST {

  /*  public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    } */

    @Test
    public void testStringComparison() {

        assertTrue(EX2.compareStrings("Hello", "Hello"));
    }
}