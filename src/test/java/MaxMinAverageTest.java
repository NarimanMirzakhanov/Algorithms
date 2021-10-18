import org.junit.Assert;
import org.junit.Test;

public class MaxMinAverageTest {

    @Test
    public void testMaxMinAverage1() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] expectedResult = new int[]{5, 1, 3};

        MaxMinAverage maxMinAverage = new MaxMinAverage();
        int[] actualResult = maxMinAverage.getMaxMinAverage(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinAverage2() {
        int[] array = new int[]{-3, 0, 155, -39, 1003};
        int[] expectedResult = new int[]{1003, -39, 223};

        MaxMinAverage maxMinAverage = new MaxMinAverage();
        int[] actualResult = maxMinAverage.getMaxMinAverage(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinAverage3() {
        int[] array = new int[]{1};
        int[] expectedResult = new int[]{1, 1, 1};

        MaxMinAverage maxMinAverage = new MaxMinAverage();
        int[] actualResult = maxMinAverage.getMaxMinAverage(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinAverage4() {
        int[] array = new int[]{};
        int[] expectedResult = new int[]{};

        MaxMinAverage maxMinAverage = new MaxMinAverage();
        int[] actualResult = maxMinAverage.getMaxMinAverage(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinAverage5() {
        int[] array = new int[]{-3, 3};
        int[] expectedResult = new int[]{3, -3, 0};

        MaxMinAverage maxMinAverage = new MaxMinAverage();
        int[] actualResult = maxMinAverage.getMaxMinAverage(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
