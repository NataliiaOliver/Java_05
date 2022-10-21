import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test(priority = 1)
    public void testSumArrayPositiveNumbers_HappyPath() {

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().SumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testSumArrayNegativeNumbers_HappyPath() {

        int[] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().SumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testSumArrayOneIntegerMax_HappyPath() {

        int[] array = {Integer.MAX_VALUE + 1};
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = new SumArray().SumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testSumArrayOneIntegerMin_HappyPath() {

        int[] array = {Integer.MIN_VALUE - 1};
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = new SumArray().SumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testIsEmptyArray_Negative() {

        int[] array = {};
        int expectedResult = 0;

        int actualResult = new SumArray().SumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 6)
    public void testIsZeroNumber_Negative() {

        int[] array = {0};
        int expectedResult = 0;

        int actualResult = new SumArray().SumArrayAlgorithm(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
