package Pre;

public class TimeToEquality {
    //Given an integer array A of size N.
    //In 1 second, you can increase the value of one element by 1
    //Find the minimum time in seconds to make all elements of the array equal
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(time(a));
    }

    public static int time(int[] arr){
        int max = maxValue(arr);
        int totalTime = 0;

        for (int i = 0; i < arr.length; i++) {
            totalTime += max - arr[i];
        }
        return totalTime;
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
