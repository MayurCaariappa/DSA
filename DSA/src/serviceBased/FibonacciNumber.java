package serviceBased;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        fibonacciSeries(n);
        nthFibonacci(n);
    }

    public static void fibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            temp = a + b;
            System.out.print(" " + temp);

            a = b;
            b = temp;
        }
    }

    public static void nthFibonacci(int index) {
        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 2; i < index; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}
