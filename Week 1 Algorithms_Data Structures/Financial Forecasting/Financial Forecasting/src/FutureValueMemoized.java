public class FutureValueMemoized {
    public static double calculate(double presentValue, double rate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];

        memo[years] = (1 + rate) * calculate(presentValue, rate, years - 1, memo);
        return memo[years];
    }
}

