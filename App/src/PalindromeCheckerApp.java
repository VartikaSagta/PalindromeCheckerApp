import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

          String input = "rotator";

        System.out.println("==========================================");
        System.out.println("Use Case 9 - Recursive Palindrome Check");
        System.out.println("Input String : " + input);

        boolean isPalindrome = check(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("==========================================");
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base Case: If start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}