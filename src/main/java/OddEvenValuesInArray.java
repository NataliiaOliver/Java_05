import project_utils.Utils;

public class OddEvenValuesInArray {

    public int countEvenValuesInArray(int[] array) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            int count = Utils.countEvenNumbersInArray(array);

            return count;
        }

        return 0;
    }

    public int countOddValuesInArray(int[] array) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            int count = Utils.countOddNumbersInArray(array);

            return count;
        }

        return 0;
    }
}
