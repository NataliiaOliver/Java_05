import project_utils.Utils;

public class OddIndices {

    public int[] oddIndicesAlgorithm(int[] array) {
        if (Utils.checkForEmptyArray(array)) {
            int[] arrayOddIndices = new int[array.length / 2];
            int countOdd = 0;
            for (int i = 1; i < array.length; i += 2) {
                arrayOddIndices[countOdd] = array[i];
                countOdd++;
            }

            return arrayOddIndices;
        }

        return new int[]{};
    }
}
