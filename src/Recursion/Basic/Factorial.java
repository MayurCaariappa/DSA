package Recursion.Basic;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(brute(n));
        System.out.println(recursion(n));
    }

    public static int brute(int n) {
        int factorial = 1;
        while (n > 0) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }

    public static int recursion(int n) {
        if (n == 0) return 1;
        return n * recursion(n - 1);
    }
}
