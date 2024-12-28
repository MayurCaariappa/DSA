package Pre;

import java.util.Arrays;

public class ReverseRange {
    //Given an array A of N integers & also 2 integers B & C.
    //Reverse the elements of the Array A within the given inclusive range [B,C]
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int b = 0;
        int c = 3;

//        reverseRangeNumbers(a, b, c);
        reverseRangeIndices(a, b, c);
    }

    public static void reverseRangeNumbers(int[] a, int b, int c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == b && a[j] == c) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void reverseRangeIndices(int[] a, int b, int c) {
            int temp = a[b];
            a[b] = a[c];
            a[c] = temp;
        System.out.println(Arrays.toString(a));
    }
}
