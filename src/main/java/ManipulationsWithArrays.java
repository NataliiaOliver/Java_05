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

    public double[] toDoubleArray(int[] array) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            double[] newArray = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i] * 1.0;
            }

            return newArray;
        }

        return new double[]{};
    }

    public int[] toIntArray(double[] array) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = (int)array[i];
            }

            return newArray;
        }

        return new int[]{};
    }

    public String[] toStringArray(int[] array) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            String[] newArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = "" + array[i];
            }

            return newArray;
        }

        return new String[]{};
    }

    public String[] toStringArray(double[] array) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            String[] newArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = "" + array[i];
            }

            return newArray;
        }

        return new String[]{};
    }

}
