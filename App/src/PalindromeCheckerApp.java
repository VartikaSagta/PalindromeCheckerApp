import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";

        System.out.println("==========================================");
        System.out.println("Use Case 5 - Stack Based Palindrome Check");
        System.out.println("Input String : " + input);

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare original string with popped characters
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("==========================================");
    }
}