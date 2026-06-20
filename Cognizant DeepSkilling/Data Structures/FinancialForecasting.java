public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return predictFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double presentValue = 10000.0; // Initial amount
        double growthRate = 0.10;      // 10% annual growth
        int years = 5;

        double futureValue = predictFutureValue(presentValue, growthRate, years);

        System.out.println("Present Value: " + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.printf("Predicted Future Value: %.2f\n", futureValue);

        // Analysis
        System.out.println("\nAnalysis:");
        System.out.println("Time Complexity of Recursive Algorithm: O(n)");
        System.out.println("Space Complexity: O(n) due to recursion stack.");
        System.out.println("Optimization:");
        System.out.println("- Use iteration to reduce space complexity to O(1).");
        System.out.println("- Use memoization when recursive subproblems overlap to avoid excessive computation.");
    }
}