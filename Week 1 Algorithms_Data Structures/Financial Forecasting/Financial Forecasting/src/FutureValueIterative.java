public class FutureValueIterative {
    public static double calculate(double presentValue, double rate, int years) {
        double future = presentValue;
        for (int i = 0; i < years; i++) {
            future *= (1 + rate);
        }
        return future;
    }
}
