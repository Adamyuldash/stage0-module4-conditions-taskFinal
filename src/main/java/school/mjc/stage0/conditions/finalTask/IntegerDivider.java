package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        // Get the dividend and divider from the arguments


        // Check if the divider is 0
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        // Perform integer division of dividend by divider
        int quotient = dividend / divider;

        // Multiply the quotient by the divider
        int product = quotient * divider;

        // Check if the product is equal to the dividend
        if (product == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}
