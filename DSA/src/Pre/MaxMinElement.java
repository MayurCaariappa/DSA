package Pre;

public class MaxMinElement {
    //Given an array A of size N.
    //You need to find the sum of Maximum and Minimum element in the given array
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, -12, 435};
        int sum = min(a) + max(a);
        System.out.println(sum);
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = arr[i];
            }

        }
        return max;
    }
}
