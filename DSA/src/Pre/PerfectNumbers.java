package Pre;

public class PerfectNumbers {
    //You are given an integer A. You have to tell whether it is a PN or not.
    //PN is a positive integer which is equal to the sum of its proper positive divisors.
    //a proper divisor of a natural number is the divisor that is strictly less than the number
    //Ex: 6,28,496,8128
    public static void main(String[] args) {
        System.out.println(perfectNumbers(8128));
    }

    public static boolean perfectNumbers(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }

        System.out.println("");
        boolean isPerfect = (sum == num);
        return isPerfect;
    }
}
