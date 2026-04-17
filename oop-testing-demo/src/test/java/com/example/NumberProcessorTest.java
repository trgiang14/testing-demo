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
    @Test
    void testEmptyArray() {
        NumberProcessor np = new NumberProcessor();
        int[] arr = {};
        assertEquals(0, np.processNumbers(arr));
    }

    @Test
    void testOnlyEven() {
        NumberProcessor np = new NumberProcessor();
        int[] arr = {2, 4};
        assertEquals(6, np.processNumbers(arr));
    }

    @Test
    void testOnlyOdd() {
        NumberProcessor np = new NumberProcessor();
        int[] arr = {1, 3};
        assertEquals(-4, np.processNumbers(arr));
    }

    @Test
    void testMixedPath() {
        NumberProcessor np = new NumberProcessor();
        int[] arr = {2, 3, 4};
        assertEquals(3, np.processNumbers(arr));
    }
}