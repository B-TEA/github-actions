import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    // Constant 2 plus 2 = 4.
    private final int result2Plus2 = 4;

    /**
     * Basic Test.
     * Checks if 2 + 2 = 4
     */
    @Test
    public void testSum() {
        Assert.assertEquals(result2Plus2, SimpleProg.sum(2, 2));
    }

}
