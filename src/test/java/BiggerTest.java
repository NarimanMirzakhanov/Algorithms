import org.junit.Assert;
import org.junit.Test;

public class BiggerTest {

    @Test
    public void testBigger() {
        int a = 3333;
        int b = 9999;
        int expectedResult = b;

        Bigger bigger = new Bigger();
        int actualResult = bigger.getBigger(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
