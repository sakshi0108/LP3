public class Pr1_FibonacciSeries {
    // Pr1_FibonacciSeries() {
    // int num1 = 0;
    // int num2 = 0;
    // }
    void Fibonacci(int N) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < N) {
            System.out.print(num1 + " ");

            // calculating next number in series by adding previous two numbers
            int num3 = num1 + num2;
            if (num3 > N) {
                break;
            }
            // swapping
            num1 = num2;
            num2 = num3;
            counter += 1;
        }
    }

    public static void main(String args[]) {
        Pr1_FibonacciSeries fb = new Pr1_FibonacciSeries();
        int N = 10;
        fb.Fibonacci(N);
    }
}
