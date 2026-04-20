package Recursion.Basic;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Integer[] arr1 = {5, 4, 3, 2, 1};
//        brute(arr);
//        better(arr);
//        best(arr1);

        recursion(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void brute(int[] arr) {
        int arrLength = arr.length;
        int[] arrDup = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arrDup[i] = arr[arrLength - 1 - i];
        }
        System.out.println(Arrays.toString(arrDup));
    }

    public static void better(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p2 > p1) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++; //move left pointer to right
            p2--; //move right pointer to left
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void best(Integer[] arr) {
        List<Integer> dupArr = Arrays.asList(arr);
        Collections.reverse(dupArr);
        System.out.println(dupArr);
    }

    //In recursion, always pass changing variables as parameters — otherwise state resets every call.
    public static void recursion(int[] arr, int left, int right) {
        if (left >= right) return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        recursion(arr, left + 1, right - 1);
    }
}
