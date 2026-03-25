package ArraysStrings;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        Arrays();
    }

    public static void Arrays(){
        String[] arr1 = {"a", "b"};
        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.toString(arr1)); //arr1 is an array object
        System.out.println(arr1[1]); //sout knows how to print it directly
        System.out.println(arr1); //prints object reference

        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[2]);


    }
}
