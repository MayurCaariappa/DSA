package serviceBased;

public class CountDigits {
    public static void main(String[] args) {
        int num = 3232443;
        countDigits(num);
    }

    public static void countDigits(int num) {
        int count = 0;

        if (num == 0) {
            count++;
        }

        if (num < 0) {
            num = -num;
        }

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
