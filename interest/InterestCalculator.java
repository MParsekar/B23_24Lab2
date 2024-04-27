public class InterestCalculator {
    /**
     * Calculates the simple interest accrued on a principal amount over a specified time period.
     *
     * @param principal The principal amount on which interest is calculated.
     * @param rate      The interest rate per period, expressed as a percentage.
     * @param time      The time period, in years, over which the interest is applied.
     * @return          The simple interest accrued on the principal amount.
     */
    public double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Example usage:
        InterestCalculator calculator = new InterestCalculator();
        double principal = 1000;  // Principal amount
        double rate = 5;          // Interest rate (5%)
        int time = 2;             // Time period (2 years)

        // Calculate the interest
        double interest = calculator.calculateInterest(principal, rate, time);
        System.out.println("Simple Interest: " + interest);
    }
}
