public class OddEven {

    public String oddEvenAlgorithm(long number) {
        String even = "Even";
        String odd = "Odd";
        String undefined = "Undefined";

        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
            if (number % 2 == 0) {

                return even;
            } else {

                return odd;
            }
        }

        return undefined;
    }
}
