import org.junit.Assert;
import org.junit.Test;

public class EvenArrayTest {

    @Test
    public void testEvenArray() {
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        EvenArray evenArray = new EvenArray();
        int[] actualResult = evenArray.getEvenArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
