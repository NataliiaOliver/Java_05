import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test(priority = 1)
    public void testBiggerValue_HappyPath() {

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        int actualResult = new BiggerValue().biggerValueAlgorithm(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testTheSameNumbers_HappyPath() {

        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;

        int actualResult = new BiggerValue().biggerValueAlgorithm(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testOneNegativeNumberOnePositiveNumber_HappyPath() {

        int a = -3333;
        int b = 3333;
        int expectedResult = 3333;

        int actualResult = new BiggerValue().biggerValueAlgorithm(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
