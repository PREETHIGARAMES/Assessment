public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double resultRecursive = FutureValueRecursive.calculate(presentValue, growthRate, years);
        double[] memo = new double[years + 1];
        double resultMemo = FutureValueMemoized.calculate(presentValue, growthRate, years, memo);
        double resultIterative = FutureValueIterative.calculate(presentValue, growthRate, years);

        System.out.printf("Recursive Result: ₹%.2f%n", resultRecursive);
        System.out.printf("Memoized Result: ₹%.2f%n", resultMemo);
        System.out.printf("Iterative Result: ₹%.2f%n", resultIterative);
    }
}

