import org.testng.Assert;
import org.testng.annotations.Test;

public class PerformActionsWithMTest {

    @Test(priority = 1)
    public void testPerformActionsWithM_MIsMultipleSevenAndNine_HappyPath() {

        int m = 63;
        String expectedResult = "Good Number";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 2)
    public void testPerformActionsWithM_MIsNegativeNumberMultipleSevenAndNine_HappyPath() {

        int m = -63;
        String expectedResult = "Good Number";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3)
    public void testPerformActionsWithM_MIsMultipleNineAndNotSeven_HappyPath() {

        int m = 9;
        String expectedResult = "Bad Number";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 4)
    public void testPerformActionsWithM_MIsNegativeNumberMultipleNineAndNotSeven_HappyPath() {

        int m = -9;
        String expectedResult = "Bad Number";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 5)
    public void testPerformActionsWithM_MIsMultipleEleven_HappyPath() {

        int m = 11;
        String expectedResult = "Poor Number";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 6)
    public void testPerformActionsWithM_MIsNegativeNumberMultipleEleven_HappyPath() {

        int m = -11;
        String expectedResult = "Poor Number";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 7)
    public void testPerformActionsWithM_MDoesNotSatisfyConditions_HappyPath() {

        int m = 32;
        String expectedResult = "-1";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 8)
    public void testPerformActionsWithM_MIsNegativeNumberDoesNotSatisfyConditions_HappyPath() {

        int m = -32;
        String expectedResult = "-1";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 9)
    public void testPerformActionsWithM_MIsZero_HappyPath() {

        int m = 0;
        String expectedResult = "Good Number";

        String actualResult = new PerformActionsWithM().performActionsWithMAlgorithm(m);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
