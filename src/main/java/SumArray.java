import project_utils.Utils;

public class SumArray {

    public int sumArrayAlgorithm(int[] array) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            int sumElements = 0;
            for (int i = 0; i < array.length; i++) {
                sumElements += array[i];
            }

            return sumElements;
        }

        return 0;
    }
}
