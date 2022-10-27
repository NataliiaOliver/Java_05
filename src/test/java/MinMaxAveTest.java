import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test(priority = 1)
    public void testMinMaxAve_PositiveIndexes_HappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testMinMaxAve_OneNegativeIndex_Negative() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testMinMaxAve_ArrayOfTwo_HappyPath() {
        int[] array = {1, -6};
        int index1 = 1;
        int index2 = 0;
        int[] expectedResult = {-6, 1, -2};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testMinMaxAve_ArrayOfOne_HappyPath() {
        int[] array = {2};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = {2, 2, 2};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testMinMaxAve_IndexesAreEquals_HappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 2;
        int[] expectedResult = {3, 3, 3};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 6)
    public void testMinMaxAve_ArrayIsEmpty_Negative() {
        int[] array = {};
        int index1 = 2;
        int index2 = 2;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 7)
    public void testMinMaxAve_NullArray_Negative() {
        int[] array = null;
        int index1 = 2;
        int index2 = 2;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 8)
    public void testMinMaxAve_OutOfBoundsIndexes_Negative() {
        int[] array = {1, 2, 3};
        int index1 = 12;
        int index2 = 0;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve().minMaxAveAlgorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
