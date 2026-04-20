package Recursion.Basic;

public class Sum {
    public static void main(String[] args) {
        int n = 1; //1,2,3,4,5,6
        System.out.println(brute(n));
        System.out.println(recursion(n));
    }

    public static int brute(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }

    //forward tracking
    public static int recursion(int n) {
        if (n == 0) return 0;
        return n + recursion(n - 1);
    }

    /* How it works?
        sum(5)
        = 5 + sum(4)
        = 5 + 4 + sum(3)
        = 5 + 4 + 3 + sum(2)
        = 5 + 4 + 3 + 2 + sum(1)
        = 5 + 4 + 3 + 2 + 1 + sum(0)
        = 15
     */
}
