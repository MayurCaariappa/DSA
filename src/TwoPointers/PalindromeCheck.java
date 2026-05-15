package TwoPointers;

public class PalindromeCheck {
    public static void main(String[] args) {
        String word = "madam";
        String advWord = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(word));
        System.out.println(isAdvPalindrome(advWord));
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Ignore spaces, commas, special chars, uppercase.
    public static boolean isAdvPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
