package Day03;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] a = {1, 2, -2, 2, -2};
        System.out.println(equilibrium(a));
    }

    public static int equilibrium(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            int leftIndex = i - 1;
            int rightIndex = i + 1;

            while (leftIndex >= 0) {
                leftSum += arr[leftIndex];
                leftIndex--;
            }

            while (rightIndex < arr.length) {
                rightSum += arr[rightIndex];
                rightIndex++;
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
