import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

          String input = "A man a plan a canal Panama";

        System.out.println("==========================================");
        System.out.println("Use Case 10 - Normalized Palindrome Check");
        System.out.println("Original Input : " + input);

        // Normalize the string
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "")  // Remove spaces & symbols
                .toLowerCase();                  // Convert to lowercase

        System.out.println("Normalized Input : " + normalized);

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("==========================================");
    }

    /**
     * Checks palindrome using two-pointer technique.
     *
     * @param s Normalized string
     * @return true if palindrome, otherwise false
     */
    private static boolean checkPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}