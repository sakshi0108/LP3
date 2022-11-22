public class Pr1_FibonacciSeriesResursion {
    public int num1, num2;

    // Pr1_FibonacciSeriesResursion() {
    // num1 = 0;
    // num2 = 1;
    // }

    int Fibonacci(int counter) {
        if (counter == 0) {
            return 0;
        }
        if (counter == 1 || counter == 2) {
            return 1;
        }
        return Fibonacci(counter - 1) + Fibonacci(counter - 2);
    }

    public static void main(String args[]) {
        Pr1_FibonacciSeriesResursion fbr = new Pr1_FibonacciSeriesResursion();
        int N = 10;
        for (int counter = 0; counter < N; counter++) {
            System.out.print(fbr.Fibonacci(counter) + " ");
        }
    }
}
