import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test(priority = 1)
    public void testOddIndices_HappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().OddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testOddIndicesEmptyArray_Negative() {

        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().OddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testOddIndicesZeroNumber_Negative() {

        int[] array = {0};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().OddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
