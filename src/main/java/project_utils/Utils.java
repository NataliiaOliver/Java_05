package project_utils;

public class Utils {

    /**
     * Random number generation methods:
     */
    public static int getRandomInt(int upper, int lower) {

        return (int) (Math.random() * (upper - lower) + lower);
    }

    public static double getRandomDouble(int upper, int lower) {

        return ((Math.random() * (upper - lower) + lower));
    }

    /**
     * Method of creating an array with Random int numbers:
     */
    public static int[] createArrayRandomInt(int length, int upper, int lower) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(upper, lower);
        }

        return array;
    }

    /**
     * Method_2 of creating an array with Random int numbers:
     */
    public static int[] generationRandomArrayMainInt(int length, int from, int to) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + (int) (Math.random() * (to + 1));
        }

        return array;
    }

    /**
     * Method of creating an array with Random double numbers:
     */
    public static double[] createArrayRandomDouble(int length, int upper, int lower) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomDouble(upper, lower);
        }

        return array;
    }

    /**
     * A generic method for creating an array with any data type and any length:
     */
    public static Object[] createArray(Object... v) {
        Object[] array = new Object[v.length];
        for (int i = 0; i < v.length; i++) {
            array[i] = v[i];
        }

        return array;
    }

    /**
     * Method of creating an array of random positive numbers:
     */
    public static int[] arrayRandomPositiveNumbers(int length, int upper, int lower){
        if (length <= 0 || upper <= 0 || lower <= 0) {

            return new int[]{};
        }

        return createArrayRandomInt(length, upper, lower);
    }

    /**
     * Method of creating an array of random negative numbers:
     */
    public static int[] arrayRandomNegativeNumbers(int length, int upper, int lower){
        if (length <= 0 || upper >= 0 || lower >= 0) {
            return new int[]{};
        }

        return createArrayRandomInt(length, upper, lower);
    }

    /**
     * Method of creating a two-dimensional array:
     */
    public static int[][] integerRandomNumbers2DArray(int row, int column, int upper, int lower) {
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomInt(upper, lower);
            }
        }

        return array;
    }

    /**
     * Method_2 of creating a two-dimensional array:
     */
    public static int[][] array2D(int[][] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 0; j < arrayName[i].length; j++) {
                arrayName[i][j] = (int) (Math.random() * 10);
            }
        }

        return arrayName;
    }

    /**
     * Array printing methods (int, double, String, boolean):
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Methods to calculate the average value of the elements of the array (int, double):
     */
    public static double averageArray(int[] array) {
        double sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }

        return sumOfElements / array.length;
    }

    public static double averageArray(double[] array) {
        double sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }

        return sumOfElements / array.length;
    }

    /**
     * Methods for calculating the minimum value of the elements of an array (int, double):
     */
    public static int minValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static double minValue(double[] array) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     * Methods for calculating the maximum value of the elements of an array (int, double):
     */
    public static int maxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static double maxValue(double[] array) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Method for calculating the minimum value, the maximum value and average of the elements of an array:
     */
    public static int[] minMaxAverageArray(int[] nameArray) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average;
        int sum = 0;
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] < min) {
                min = nameArray[i];
            }
            if (nameArray[i] > max) {
                max = nameArray[i];
            }
            sum += nameArray[i];
        }
        average = sum / nameArray.length;

        int[] result = {min, max, average};

        return result;
    }


}
