import org.junit.Assert;
import org.junit.Test;

public class SumSequenceTest {

    @Test
    public void testSemSequence1() {
        int number = 222;
        int expectedResult = 24753;

        SumSequence sumSequence = new SumSequence();
        int actualResult = sumSequence.getSumSequence(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSemSequence2() {
        int number = -10;
        int expectedResult = 56;

        SumSequence sumSequence = new SumSequence();
        int actualResult = sumSequence.getSumSequence(number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
