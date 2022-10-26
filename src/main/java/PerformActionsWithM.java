public class PerformActionsWithM {

    public String performActionsWithMAlgorithm(int m) {

        String goodNumber = "Good Number";
        String badNumber = "Bad Number";
        String poorNumber = "Poor Number";
        String doesNotSatisfyConditions = "-1";

        if (m != 0) {
            if (m % 7 == 0 && m % 9 == 0) {

                return goodNumber;
            }
            if (m % 9 == 0) {

                return badNumber;
            }
            if (m % 11 == 0) {

                return poorNumber;
            } else {

                return doesNotSatisfyConditions;
            }
        }

        return "Zero is always multiple of every number";
    }
}
