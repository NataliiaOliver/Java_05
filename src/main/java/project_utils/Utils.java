package project_utils;

public class Utils {

    /**
     * метод генераци Рэндомных чисел (Random Numbers):
     */
    public static int getRandomInt(int upper, int lower) {

        return (int) (Math.random() * (upper - lower) + lower);
    }

    public static double getRandomDouble(int upper, int lower) {

        return ((Math.random() * (upper - lower) + lower));
    }
}
