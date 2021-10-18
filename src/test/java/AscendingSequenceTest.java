import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequence1() {
        int a = 10;
        int b = 25;
        int n = 5;
        int[] expectedResult = {10, 15, 20, 25};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.getAscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequence2() {
        int a = 10;
        int b = -25;
        int n = -5;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.getAscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequence3() {
        int a = 10;
        int b = 10;
        int n = 2;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.getAscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
