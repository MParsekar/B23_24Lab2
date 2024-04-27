public class Interestcalculator {

    /**
     * Calculates the simple interest.
     *
     * @param principal the principal amount (initial amount of money)
     * @param rate      the annual interest rate
     * @param time      the time period in years
     * @return the simple interest calculated based on the provided principal, rate, and time
     */
    public double calculateInterest(double principal, double rate, int time) {
        // Simple interest formula: principal * rate * time / 100
        return principal * rate * time / 100;
    }

    /**
     * Main method to demonstrate the usage of the calculateInterest method.
     */
    public static void main(String[] args) {
        // Example usage of calculateInterest method
        double principal = 1000;
        double rate = 5; // 5% annual interest rate
        int time = 2; // 2 years
        Interestcalculator calculator = new Interestcalculator();
        double interest = calculator.calculateInterest(principal, rate, time);
        System.out.println("Simple interest: " + interest);
    }
}