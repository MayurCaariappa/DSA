package Recursion.Basic;

public class PrintNumber {
    //Forward → "Do now, then go deeper"
    //Backtracking → "Go deep first, then do while coming back"
    //Forward recursion processes before the call, while backtracking processes during the return phase.
    //Base case = smallest subproblem where recursion should stop and return a known result
    public static void main(String[] args) {
        int n = 6;
//        forwardRecursion(1, n); //1,2,3,4,5,6
//        backtracking(1, n); //6,5,4,3,2,1

//        forward(n); //6,5,4,3,2,1
        backward(n); //1,2,3,4,5,6
    }

    public static void forwardRecursion(int i, int n) {
        if (i > n) return; // base case
        System.out.println(i); // work first
        forwardRecursion(i + 1, n); // then recursion
    }

    public static void backtracking(int i, int n) {
        if (i > n) return;
        backtracking(i + 1, n); // recursion first
        System.out.println(i); // work after
    }

    public static void forward(int n) {
        if (n == 0) return;
        System.out.println(n);
        forward(n - 1);
    }

    public static void backward(int n) {
        if (n == 0) return;
        backward(n - 1);
        System.out.println(n);
    }
}
