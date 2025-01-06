package serviceBased;

public class DigitOccurance {
    public static void main(String[] args) {
        int num = 0;
        int n = 0;
        digitRepeat(num, n);
    }

    public static void digitRepeat(int num, int n) {
        int count = 0;

        if (num == 0 && n == 0) {
            count++;
        }

        if (num < 0) {
            num = -num;
        }

        while (num > 0) {
            if (num % 10 == n) {
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);
    }
}
