import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAve_V2Test {

    @Test(priority = 1)
    public void testMinMaxAve_V2_HappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = new MinMaxAve_V2().minMaxAve_V2Algorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testMinMaxAve_V2_AllLengthRange_HappyPath() {
        int[] array = {31, 23, 1, 0, 121, 15, 7, -2, 0};
        int index1 = 0;
        int index2 = 8;
        int[] expectedResult = {-2, 121, 21};

        int[] actualResult = new MinMaxAve_V2().minMaxAve_V2Algorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testMinMaxAve_V2_TheSameIndexes_HappyPath() {
        int[] array = {1, 2, 3};
        int index1 = 1;
        int index2 = 1;
        int[] expectedResult = {2};

        int[] actualResult = new MinMaxAve_V2().minMaxAve_V2Algorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testMinMaxAve_V2_NullArray_Negative() {
        int[] array = null;
        int index1 = 1;
        int index2 = 1;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve_V2().minMaxAve_V2Algorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testMinMaxAve_V2_ArrayIsEmpty_Negative() {
        int[] array = {};
        int index1 = 1;
        int index2 = 1;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve_V2().minMaxAve_V2Algorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 6)
    public void testMinMaxAve_V2_OutOfBoundsIndexes_Negative() {
        int[] array = {1, 2, 3, 4};
        int index1 = 3;
        int index2 = 7;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve_V2().minMaxAve_V2Algorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 7)
    public void testMinMaxAve_V2_NegativeIndexes_Negative() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int index1 = -1;
        int index2 = -3;
        int[] expectedResult = {};

        int[] actualResult = new MinMaxAve_V2().minMaxAve_V2Algorithm(array, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
