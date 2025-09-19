package Pre;

public class SecondLargest {
    //Given an integer array A.
    //Find the second-largest element in the array or report that no such element exist (return -1)
    public static void main(String[] args) {
        int[] a = {5, 5, 4, 3};
        System.out.println(secondLargest(a));
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (arr.length == 1) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }
}
