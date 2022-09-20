import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

public class Basics_test {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testsplit() {
        String expected = "DstyfwdLL";
        String actual = Basics.split("Danke schoen, thank you for walks down Lover's Lane");
        assertEquals(expected, actual);
    }

    @Test
    public void testoddSum() {
        int expected = 9;
        int actual = Basics.oddSum(new int[]{0, 2, 0, 7, 0});
        assertEquals(expected, actual);
    }

    @Test
    public void testoddSum_empty() {
        int expected = 0;
        int actual = Basics.oddSum(new int[]{});
        assertEquals(expected, actual);
    }

    @Test
    public void testoddSum_one() {
        int expected = 0;
        int actual = Basics.oddSum(new int[]{5});
        assertEquals(expected, actual);
    }

    @Test
    public void testoddSum_two() {
        int expected = 4;
        int actual = Basics.oddSum(new int[]{2, 4});
        assertEquals(expected, actual);
    }
}
