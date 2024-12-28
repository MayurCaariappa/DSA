package Pre;

public class CountOfElements {
    //Given an array A of N integers
    //Count the number of elements that have at least 1 element greater than itself
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(countElements(a));
    }

    public static int countElements(int[] arr) {
        int max = maxValue(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                count++;
            }
        }
        return count;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
