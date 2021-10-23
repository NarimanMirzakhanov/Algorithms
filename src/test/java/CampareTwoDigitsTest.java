import org.junit.Assert;
import org.junit.Test;

public class CampareTwoDigitsTest {

    @Test
    public void testCampareTwoDigits() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        CampareTwoDigits campareTwoDigits = new CampareTwoDigits();
        int actualResult = campareTwoDigits.campareTwoDigits(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
