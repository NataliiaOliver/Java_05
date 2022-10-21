import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstNumberInSequenceTest {

    /**
     * 1. Happy Paths
     * step != 0
     */

    @Test
    // if (start % step == 0)
    public void testStartIsDivisibleByStep_StartStepArePositive() {
        int start = 7;
        int step = 7;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, start);
    }

    @Test
    public void testStartIsDivisibleByStep_StartStepAreNegative() {
        int start = -14;
        int step = -7;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, start);
    }

    @Test
    public void testStartIsDivisibleByStep_StartNegativeStepPositive() {
        int start = -21;
        int step = 7;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, start);
    }

    @Test
    public void testStartIsDivisibleByStep_StartPositiveStepNegative() {
        int start = 21;
        int step = -7;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, start);
    }

    @Test
    // else if (step > 0 && start < 0)
    // return start - start % step;
    public void testStartNotDivisible_StartNegativeStepPositive() {
        int start = -26;
        int step = 7;
        int expectedResult = -21;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    // else if (step < 0 && start > 0)
    // return start - start % step;
    public void testStartNotDivisible_StartPositiveStepNegative() {
        int start = 26;
        int step = -7;
        int expectedResult = 21;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    // if (step > 0 && start > 0)
    // return start + (step - start % step)
    public void testStartNotDivisible_StartPositiveStepPositive() {
        int start = 26;
        int step = 7;
        int expectedResult = 28;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //(step < 0 && start < 0)
    // return start + (step - start % step)
    public void testStartNotDivisible_StartNegativeStepNegative() {
        int start = -26;
        int step = -7;
        int expectedResult = -28;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * 2. Negative Testing
     * step == 0
     */

    @Test
    // start == 0, step == 0
    public void testStartIsZero_StepIsZero() {
        int start = 0;
        int step = 0;
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    // start < 0, step == 0
    public void testStartIsNegative_StepIsZero() {
        int start = -14;
        int step = 0;
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    // start > 0, step == 0
    public void testStartIsPositive_StepIsZero() {
        int start = 26;
        int step = 0;
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = new FirstNumberInSequence().getFirstNumberDivisibleByStep(start, step);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
