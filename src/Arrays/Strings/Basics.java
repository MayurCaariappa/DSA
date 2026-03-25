package Arrays.Strings;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
//        basicPrinting();
//        primitiveVsObjectArrays();
//        length();
//        sorting();
//        copying();
        primitiveVsReference();
    }

    // Printing Arrays
    public static void basicPrinting() {
        String[] arr1 = {"a", "b"};
        int[] arr2 = {1, 2, 3};

        System.out.println(arr1); //Arrays are objects. Prints object reference
        System.out.println(Arrays.toString(arr1)); //converts to readable string and prints contents
        System.out.println(arr1[1]); //accessing specific elements returns the value itself

        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[2]);
    }

    // Primitive vs Wrapper
    public static void primitiveVsObjectArrays() {
        int[] arr1 = {1, 2, 3}; //primitive array
        Integer[] arr2 = {4, 5, 6}; //object array

        System.out.println(Arrays.toString(arr1)); //primitive: stores raw values
        System.out.println(Arrays.toString(arr2)); //wrapper: stores objects
    }

    // length property
    public static void length() {
        String[] arr1 = {"a", "b"};
        int[] arr2 = {1, 2, 3};
        String a = "Mayur ";

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(a.length());
    }

    // sorting arrays
    public static void sorting() {
        int[] arr1 = {9, 3, 5, 1, 2};
        String[] arr2 = {"c", "a", "b"};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    // copying
    public static void copying() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 99;

        //arr1, arr2 point to same array in memory, cause arrays are reference types
        //so when arr2 is modified, arr1 also changes
        System.out.println(arr2[0]);
        System.out.println(arr1[0]);

        //correct way to copy
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        arr3[0] = 5;
        System.out.println(arr1[0]);
    }

    // comparison
    public static void primitiveVsReference() {
        int a = 100;
        int b = 100;
        System.out.println(a == b); //true -> compares actual values for primitives (int, char, etc)
                                    //For primitives, == compares values. For objects, it compares references.

        //== → reference (memory)
        //.equals() → content (value)

        //Integer is an object; hence compares memory reference, not values.
        //But Java caches Integer objects between -128 to 127
        //So both variables refer to the same cached object.
        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d); //true -> Integer cache
        Integer c1 = 200;
        Integer d1 = 200;
        System.out.println("Integer caching: " + (c1 == d1)); //false -> outside Integer cache range; hence 2 diff objects are created
        System.out.println(c1.equals(d1)); //true -> equals() compares values, not references

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(arr1 == arr2); //false -> Arrays are objects; arr1 and arr2 reference different objects
        System.out.println(Arrays.equals(arr1, arr2)); //true -> correct way to compare array contents

        //primitive: stores value, independent copy, faster
        //reference: stores memory address, multiple variables can refer to same object, changes affect all references

        //String is immutable
        String originalStr = "Hello";
        String newStr = originalStr; //both variables point to the same string object
        newStr = newStr + " World"; //creates a new String object; originalStr remains unchanged
        System.out.println(originalStr);
        System.out.println(newStr);

        //Java is always pass-by-value
        //For primitives, actual value is copied
        int x = 10;
        intModify(x); //a copy of x is passed to the method
        System.out.println("Value of x: " + x); //original remains untouched

        //For objects, reference is copied (not the object)
        //Even for objects, Java still passes by value. The value being copied is the reference (memory address).
        String str = "Mayur";
        //strModify(str); //Mayur -> reference to the String object is copied; since return value is not stored, str remains unchanged.
        str = strModify(str); //Mayur Caariappa -> String concatenation creates a new object because Strings are immutable
        System.out.println("Value of str: " + str);
    }

    public static int intModify(int x) {
        return x + 10;
    }

    public static String strModify(String x) {
        return x + " Caariappa";
    }
}
