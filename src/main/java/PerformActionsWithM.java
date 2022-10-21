public class PerformActionsWithM {

    public String performActionsWithM(int m) {

        String goodNumber = "Good Number";
        String badNumber = "Bad Number";
        String poorNumber = "Poor Number";
        String doesNotSatisfyConditions = "-1";

        if (m % 7 == 0 && m % 9 == 0) {

            return goodNumber;
        } else if (m % 9 == 0 && m % 7 != 0) {

            return badNumber;
        } else if (m % 11 == 0) {

            return poorNumber;
        } else {

            return doesNotSatisfyConditions;
        }
    }
}
