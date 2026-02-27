import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

          String input = "Madam";

        System.out.println("==========================================");
        System.out.println("Use Case 11 - OOP Palindrome Check");
        System.out.println("Input String : " + input);

        // Create service object
        PalindromeService service = new PalindromeService();

        boolean result = service.isPalindrome(input);

        if (result) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("==========================================");
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, otherwise false
     */
    public boolean isPalindrome(String input) {

        // Normalize input
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}