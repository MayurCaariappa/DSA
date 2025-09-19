package Pre;

public class LinearSearch {
    //Given an array A and an integer B, find the number of occurrences of B in A
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 4, 5, -12, 435, 5, 1};
        int b = 1;
        linearSearch(a, b);
    }

    public static int linearSearch(int[] arr, int b) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                count++;
            }
        }
        System.out.println("The number " + b + " occurs: " + count + " times.");
        return count;
    }
}
