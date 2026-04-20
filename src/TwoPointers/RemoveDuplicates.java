package TwoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 6};
        int k = removeDuplicates(array);

        // print only unique part
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr){
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
