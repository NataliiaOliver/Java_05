import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    @Test(priority = 1)
    public void testCountEvenValuesInArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 2;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testCountEvenValuesInArray_ArrayIsEmpty_Negative() {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testCountEvenValuesInArray_NullArray_Negative() {
        int[] array = null;
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
