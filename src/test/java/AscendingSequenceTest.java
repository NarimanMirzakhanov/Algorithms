import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequence() {
        int a = 10;
        int b = 10;
        int n = 2;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
