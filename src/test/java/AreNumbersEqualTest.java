import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test(priority = 1)
    public void testAreNumbersEqualNumbersAreEqual_HappyPath() {

        int a = 89;
        int b = 89;
        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testAreNumbersEqualFirstNumberLessThanSecond_HappyPath() {

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testAreNumbersEqualFirstNumberGreaterThanSecond_HappyPath() {

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testAreNumbersEqualFirstNumberGreaterThanIntegerMaxSecondIsNegative_Negative() {

        int a = Integer.MAX_VALUE + 1; // Integer.MIN_VALUE
        int b = -89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testAreNumbersEqualFirstNumberGreaterThanIntegerMaxSecondIsPositive_Negative() {

        int a = Integer.MAX_VALUE + 1; // Integer.MIN_VALUE
        int b = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 6)
    public void testAreNumbersEqualFirstNumberIsNegativeSecondGreaterThanIntegerMax_Negative() {

        int a = -89;
        int b = Integer.MAX_VALUE + 1; // Integer.MIN_VALUE
        int expectedResult = 1; //

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 7)
    public void testAreNumbersEqualFirstNumberIsPositiveSecondGreaterThanIntegerMax_Negative() {

        int a = 89;
        int b = Integer.MAX_VALUE + 1; // Integer.MIN_VALUE
        int expectedResult = 1; //

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 8)
    public void testAreNumbersEqualFirstNumberIsNegativeSecondLessThanIntegerMin_Negative() {

        int a = -89;
        int b = Integer.MIN_VALUE - 1; // Integer.MAX_VALUE
        int expectedResult = -1; //

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 9)
    public void testAreNumbersEqualFirstNumberIsPositiveSecondLessThanIntegerMin_Negative() {

        int a = 89;
        int b = Integer.MIN_VALUE - 1; // Integer.MAX_VALUE
        int expectedResult = -1; //

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 10)
    public void testAreNumbersEqualFirstNumberLessThanIntegerMinSecondIsNegative_Negative() {

        int a = Integer.MIN_VALUE - 1; // Integer.MAX_VALUE
        int b = -89;
        int expectedResult = 1; //

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 11)
    public void testAreNumbersEqualFirstNumberLessThanIntegerMinSecondIsPositive_Negative() {

        int a = Integer.MIN_VALUE - 1; // Integer.MAX_VALUE
        int b = 89;
        int expectedResult = 1; //

        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
