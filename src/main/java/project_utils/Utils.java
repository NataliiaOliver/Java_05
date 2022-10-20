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
     * Method of creating an array of random positive numbers:
     */
    public static int[] arrayRandomPositiveNumbers(int length, int upper, int lower){
        if (length <= 0 || upper <= 0 || lower <= 0) {

            return new int[]{};
        }

        return createArrayRandomInt(length, upper, lower);
    }
}
