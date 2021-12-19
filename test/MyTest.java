import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    private final int RESULT_TEST_2_PLUS_2 = 4;

    /**
     * Basic Test.
     * Checks if 2 + 2 = 4
     */
    @Test
    public void testSum() {
        Assert.assertEquals(RESULT_TEST_2_PLUS_2, SimpleProg.sum(2, 2));
    }

}
