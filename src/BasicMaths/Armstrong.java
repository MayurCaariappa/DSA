package BasicMaths;

public class Armstrong {
    //A number equal to the sum of its digits each raised to the power of the number of digits (e.g., 153 = 1³ + 5³ + 3³ and 371).
    public static void main(String[] args) {
        int n = 371;
//        System.out.println(brute(n));
        System.out.println(best(n));
    }

    public static boolean brute(int n) {
        int digitCount = 0;
        int originalNum = n;
        int sum = 0;
        int temp = n;

        //count digits
        while (temp > 0) {
            temp = temp / 10;
            digitCount++;
        }

        temp = n;

        //calculate sum
        while (temp > 0) {
            int lastNum = temp % 10;
            sum = sum + (int) Math.pow(lastNum, digitCount);
            temp = temp / 10;
        }
        return originalNum == sum;
    }

    public static Boolean best(int n) {
        int sum = 0;
        int originalNum = n;

        //count digits
        int digitCount = String.valueOf(n).length();

        //calculate sum
        while (n > 0) {
            int lastDigit = n % 10;
            sum = (int) (sum + Math.pow(lastDigit, digitCount));
            n = n / 10;
        }

        return sum == originalNum;
    }
}

