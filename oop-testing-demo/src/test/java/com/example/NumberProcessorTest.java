import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    @Test
    void testEvenNumbers() {
        NumberProcessor np = new NumberProcessor();
        int[] arr = {2, 4, 6};
        assertEquals(12, np.processNumbers(arr));
    }

    @Test
    void testOddNumbers() {
        NumberProcessor np = new NumberProcessor();
        int[] arr = {1, 3, 5};
        assertEquals(-9, np.processNumbers(arr));
    }

    @Test
    void testMixedNumbers() {
        NumberProcessor np = new NumberProcessor();
        int[] arr = {2, 3};
        assertEquals(-1, np.processNumbers(arr));
    }
}