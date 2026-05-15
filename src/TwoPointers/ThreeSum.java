package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// involves sorting, two pointers, duplicate handling
public class ThreeSum {
    public static void main(String[] args) {
        int[] input = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(input));
    }

    // Find all unique triplets whose sum is 0.
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) { // we use 2 here since we need 3 elements. At least 2 elements must remain after i
            // Skip duplicate fixed elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    // Skip duplicate left values
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
