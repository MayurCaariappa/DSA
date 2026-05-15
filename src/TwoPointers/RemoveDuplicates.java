package TwoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 6};
        int k = removeDuplicates(array);

        // print only unique elements
        for (int i = 0; i < k; i++) { //
            System.out.print(array[i] + " ");
        }
    }

    // modifies array and returns the valid count/length
    public static int removeDuplicates(int[] arr){
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // assign arr[j] contents to arr[i]
            }
        }
        return i + 1; // gives the count of unique elements
    }
}
