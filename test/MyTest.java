import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    /**
     * Basic Test. 
     * Checks if 2 + 2 = 4
     */
    @Test
    public void testSum() {
        int result = 4;
        Assert.assertEquals(result, SimpleProg.sum(2, 2));
    }

}
