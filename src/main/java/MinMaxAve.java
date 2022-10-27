import project_utils.Utils;

public class MinMaxAve {

    public int[] minMaxAveAlgorithm(int[] array, int index1, int index2) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array)) {
            if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {

                if (index1 > index2) {
                    int n;
                    n = index1;
                    index1 = index2;
                    index2 = n;
                }
                int sum = 0;
                int numbers = 0;
                int min = array[index1];
                int max = array[index1];

                for (int i = index1; i <= index2; i++) {
                    sum += array[i]; //сумма всех значений в диапазоне между min и max индексами
                    numbers++;       //количество значений в диапазоне между min и max индексами

                    if (array[i] < min) {
                        min = array[i];
                    } else {
                        max = array[i];
                    }
                }
                int average = Math.round(sum / numbers);

                return new int[]{min, max, average};
            }

            return new int[]{};
        }

        return new int[]{};
    }
}


