import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void testSum() {
        int result = 4;
        Assert.assertEquals(result, SimpleProg.sum(2, 2));
    }

}
