import org.junit.Assert;
import org.junit.Test;

public class WhatIsNumberTest {

    @Test
    public void testWhatNumber() {
        int m = 8;
        String expectedResult = "-1";

        WhatIsNumber whatIsNumber = new WhatIsNumber();
        String actualResult = whatIsNumber.whatIsNumber(m);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
