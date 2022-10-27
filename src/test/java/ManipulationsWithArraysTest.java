import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test(priority = 1)
    public void testMultiplyArrayByNumber_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testMultiplyArrayByNumber_NumberIsZero_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 0;
        int[] expectedResult = {0, 0, 0, 0, 0};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testMultiplyArrayByNumber_ArrayNull_Negative() {
        int[] array = null;
        int number = 3;
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testMultiplyArrayByNumber_ArrayIsEmpty_Negative() {
        int[] array = {};
        int number = 3;
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testToDoubleArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 6)
    public void testToDoubleArray_ArrayIsEmpty_Negative() {
        int[] array = {};
        double[] expectedResult = {};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 7)
    public void testToDoubleArray_NullArray_Negative() {
        int[] array = null;
        double[] expectedResult = {};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 8)
    public void testToIntArray_HappyPath() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 9)
    public void testToIntArray_ArrayIsEmpty_Negative() {
        double[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 10)
    public void testToIntArray_NullArray_Negative() {
        double[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 11)
    public void testToStringArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 12)
    public void testToStringArray_NullArray_Negative() {
        int[] array = null;
        String[] expectedResult = {};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 13)
    public void testToStringArray_ArrayIsEmpty_Negative() {
        int[] array = {};
        String[] expectedResult = {};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 14)
    public void testToStringArrayFromDouble_HappyPath() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 15)
    public void testToStringArrayFromDouble_ArrayIsEmpty_HappyPath() {
        double[] array = {};
        String[] expectedResult = {};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 15)
    public void testToStringArrayFromDouble_NullArray_HappyPath() {
        double[] array = null;
        String[] expectedResult = {};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
