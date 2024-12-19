package Pre;

public class CountPrimes {
    //You'll be given an integer n. You need to return the count of prime numbers <= n
    public static void main(String[] args) {
        System.out.println(countPrimes(23));
    }

    public static int countPrimes(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
