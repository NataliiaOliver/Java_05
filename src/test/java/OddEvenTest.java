import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test(priority = 3)
    public void testZeroNumber_HappyPath() {

        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().OddEvenAlgorithm(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 1)
    public void testEvenNumber_HappyPath() {

        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().OddEvenAlgorithm(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testOddNumber_HappyPath() {

        int number = 345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().OddEvenAlgorithm(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testGreaterThanIntegerMax_Negative() {

        long number = Integer.MAX_VALUE + 1L;
        String expectedResult = "Undefined";

        String actualResult = new OddEven().OddEvenAlgorithm(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testLessThanIntegerMin_Negative() {

        long number = Integer.MIN_VALUE - 1L;
        String expectedResult = "Undefined";

        String actualResult = new OddEven().OddEvenAlgorithm(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
