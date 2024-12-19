package Pre;

public class CountFactors {
    //Given an integer A, you need to find the count of it's factors.
    //Factor of a number is the number which divides it perfectly leaving no remainder.
    //Ex: 1,2,3,6 are factors of 6
    public static void main(String[] args) {
        countFactors(12);
    }

    public static void countFactors(int num) {
        int count = 0;
        int n = 1;
        while (n <= num) {
            if (num % n == 0) {
                System.out.print(n + " ");
                count ++;
            }
            n++;
        }
        System.out.println("");
        System.out.println("The factor count: " + count);
    }
}
