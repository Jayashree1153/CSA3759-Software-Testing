import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class EX10TEST {

    @Test
    public void testCalculateSquare() {
        double input = 3.0;
        double expectedResult = 9.0;
        double delta = 0.0001;

        double result = EX10.calculateSquare(input);

        assertEquals(expectedResult, result, delta);
    }

    @Test
    public void testCalculateCube() {
        double input = 2.0;
        double expectedResult = 8.0;
        double delta = 0.0001;

        double result = EX10.calculateCube(input);

        assertEquals(expectedResult, result, delta);
    }
}