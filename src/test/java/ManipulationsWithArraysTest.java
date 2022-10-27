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

}
