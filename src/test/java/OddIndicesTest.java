import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test(priority = 1)
    public void testOddIndices_HappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testOddIndicesTwoNumbers_HappyPath() {

        int[] array = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().oddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testOddIndicesOneNumber_HappyPath() {

        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testOddIndicesEmptyArray_Negative() {

        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testOddIndicesZeroNumber_Negative() {

        int[] array = {0};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 6)
    public void testOddIndicesNullArray_Negative() {

        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndicesAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
