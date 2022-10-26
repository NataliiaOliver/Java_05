import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test(priority = 1)
    public void testSumArrayPositiveNumbers_HappyPath() {

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testSumArrayNegativeNumbers_HappyPath() {

        int[] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testIsEmptyArray_Negative() {

        int[] array = {};
        int expectedResult = 0;

        int actualResult = new SumArray().sumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testIsZeroNumber_Negative() {

        int[] array = {0};
        int expectedResult = 0;

        int actualResult = new SumArray().sumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testIsNullArray_Negative() {

        int[] array = null;
        int expectedResult = 0;

        int actualResult = new SumArray().sumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
