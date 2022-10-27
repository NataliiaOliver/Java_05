import project_utils.Utils;

public class ManipulationsWithArrays {

    public int[] multiplyArrayByNumber(int[] array, int number) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {

            for (int i = 0; i < array.length; i++) {
                if (number == 0) {
                    array[i] = 0;
                } else if (array[i] <= Integer.MAX_VALUE / number
                        && array[i] >= Integer.MIN_VALUE / number)

                    array[i] = array[i] * number;
            }

            return array;
        }

        return new int[]{};
    }

}
