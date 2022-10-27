import project_utils.Utils;

public class MinMaxAve_V2 {

    public int[] minMaxAve_V2Algorithm(int[] array, int index1, int index2) {
        if (Utils.checkForNullArray(array) && Utils.checkForEmptyArray(array) && index1 >= 0 && index2 >= 0
                && Utils.maxValue(index1, index2) < array.length) {

            if (index1 == index2) {

                return new int[]{array[index1]};
            }

            int startIndex = Utils.minValue(index1, index2);
            int endIndex = Utils.maxValue(index1, index2);
            int[] resultArray = new int[3];
            int sumElements = 0;

            resultArray[0] = array[startIndex];
            resultArray[1] = array[startIndex];

            for (int i = startIndex; i <= endIndex; i++) {
                resultArray[0] = Utils.minValue(resultArray[0], array[i]);
                resultArray[1] = Utils.maxValue(resultArray[1], array[i]);
                sumElements += array[i];
            }
            resultArray[2] = sumElements / (endIndex - startIndex + 1);

            return resultArray;
        }

        return new int[]{};
    }
}
