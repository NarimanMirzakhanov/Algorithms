import org.junit.Assert;
import org.junit.Test;

public class DependsOnZeroTest {

    @Test
    public void testGetTrueOrFalse() {
        int digit = -555;
        boolean expectedResult = false;

        DependsOnZero dependsOnZero = new DependsOnZero();
        boolean actualResult = dependsOnZero.getTrueOrFalse(digit);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
