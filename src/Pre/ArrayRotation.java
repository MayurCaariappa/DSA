package Pre;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRotation {
    //Given an integer array A of size N and an integer B, you have to return the same array after
    //rotating it B times towards the right

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int b = 3;
        System.out.println(Arrays.toString(arrayRotation(a, b)));
    }

    public static int[] arrayRotation(int[] a, int b) {
        int n = a.length;
        b = b % n;

        reverse(a,0,n-1);
        reverse(a,0,b-1);
        reverse(a,b,n-1);

        return a;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
