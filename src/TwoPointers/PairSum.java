package TwoPointers;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 6};
        int[] unsortedArray = {6, 2, 4, 3};
        int target = 8;

//        findIndicesFromSortedArrays(sortedArray, target);
//        findNumbersFromSortArrays(sortedArray, target);
        findNumbersFromUnsortedArrays(unsortedArray, target);
    }

    public static void findIndicesFromSortedArrays(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(left + " " + right);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void findNumbersFromSortArrays(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void findNumbersFromUnsortedArrays(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
