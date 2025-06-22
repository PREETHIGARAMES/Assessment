public class FutureValueRecursive {
    public static double calculate(double presentValue, double rate, int years) {
        if (years == 0) return presentValue;
        return (1 + rate) * calculate(presentValue, rate, years - 1);
    }
}

