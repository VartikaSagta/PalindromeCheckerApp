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

        String input = "level";

        System.out.println("==========================================");
        System.out.println("Use Case 12 - Strategy Pattern Palindrome");
        System.out.println("Input String : " + input);

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        // You can switch to:
        // PalindromeStrategy strategy = new TwoPointerStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.executeStrategy(input);

        if (result) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("==========================================");
    }
}

/**
 * ============================================================
 * INTERFACE - PalindromeStrategy
 * ============================================================
 * Defines contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

/**
 * ============================================================
 * CLASS - StackStrategy
 * ============================================================
 * Stack-based palindrome implementation.
 */
import java.util.Stack;

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * ============================================================
 * CLASS - TwoPointerStrategy
 * ============================================================
 * Two-pointer palindrome implementation.
 */
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

/**
 * ============================================================
 * CONTEXT CLASS
 * ============================================================
 * Uses selected strategy.
 */
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isPalindrome(input);
    }
}