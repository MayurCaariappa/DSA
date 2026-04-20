package Recursion.Basic;

public class PrintName {
    public static void main(String[] args) {
        int n = 5;
//        normal(n);
        recursion(n);
    }

    public static void normal(int n) {
        while (n > 0) {
            System.out.println("Name");
            n--;
        }
    }

    public static void recursion(int n){
        if (n==0) return;
        System.out.println("Name");
        recursion(n-1);
    }
}
