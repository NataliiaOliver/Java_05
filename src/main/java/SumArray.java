import project_utils.Utils;

public class SumArray {

    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10
    public int SumArrayAlgorithm(int[] array) {
        if (Utils.checkForEmptyArray(array)) {
            int sumElements = 0;
            for (int i = 0; i < array.length; i++) {
                sumElements += array[i];
            }

            return sumElements;
        }

        return 0;
    }
}
