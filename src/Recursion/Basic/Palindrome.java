package Recursion.Basic;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Malayalam";
        System.out.println(brute(name));
    }

    public static Boolean brute(String str){
        str = str.toLowerCase();
        String reverse="";

        for (int i =str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }

        return str.equals(reverse);
    }
}
