package Pre;

public class IsPrime {
    //Given a number A. Return 1 if A is prime and return 0 if not.
    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }

    public static int isPrime(int num) {
        for (int n = 2; n < num; n++) {
            if (num % n == 0) {
                return 0;
            }
        }
        return 1;
    }
}
