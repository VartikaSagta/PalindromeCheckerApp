import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "radar";

        System.out.println("==========================================");
        System.out.println("Use Case 6 - Queue + Stack Palindrome Check");
        System.out.println("Input String : " + input);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        boolean isPalindrome = true;

        // Compare elements
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
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