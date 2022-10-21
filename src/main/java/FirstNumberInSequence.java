public class FirstNumberInSequence {

    private int findFirstNumberDivisibleByStep(int start, int step) {
        if (step != 0) {
            if (start % step == 0) {

                return start;
            } else if (step > 0 && start < 0 || step < 0 && start > 0) {

                return start - start % step;
            } else {

                return start + (step - start % step);
            }
        }

        return Integer.MAX_VALUE;
    }

    private int[] createSequence(int start, int end, int step) {
        int n1 = findFirstNumberDivisibleByStep(start, end);

        if (n1 != Integer.MAX_VALUE) {
            if (step > 0 && n1 >= start && n1 <= end) {
                int[] array = new int[(end - start) % step];

                for (
                        int i = n1, j = 0;
                        i <= end && j < array.length;
                        i += step, j++
                ) {
                    array[j] = i;
                }

                return array;
            } else if (step < 0 && n1 <= start && n1 >= end) {
                int[] array = new int[(end - start) % step];

                for (
                        int i = n1, j = 0;
                        i >= end && j < array.length;
                        i += step, j++
                ) {
                    array[j] = i;
                }

                return array;
            } else {

                return new int[0];
            }
        }

        return  new int[0];
    }

    public int getFirstNumberDivisibleByStep(int start, int step) {

        return findFirstNumberDivisibleByStep(start, step);
    }

    public int[] getSequence(int start, int end, int step) {

        return createSequence(start, end, step);
    }
}
