import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test(priority = 1)
    public void testNumberGreaterThanZero_HappyPath() {

        int num = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumberAlgorithm(num);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testNumberEqualsZero_HappyPath() {

        int num = 0;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumberAlgorithm(num);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(priority = 3)
    public void testNumberLessThanZero_HappyPath() {

        int num = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumberAlgorithm(num);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(priority = 4)
    public void testNumberGreaterThanIntegerMax_Negative() {

        int num = Integer.MAX_VALUE + 1;
        boolean expectedResult = false; //Integer.MIN_VALUE

        boolean actualResult = new IsPositiveNumber().isPositiveNumberAlgorithm(num);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test(priority = 5)
    public void testNumberLessThanIntegerMin_Negative() {

        int num = Integer.MIN_VALUE - 1;
        boolean expectedResult = true; //Integer.MAX_VALUE

        boolean actualResult = new IsPositiveNumber().isPositiveNumberAlgorithm(num);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
