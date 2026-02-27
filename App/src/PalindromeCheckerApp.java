import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

         // Hardcoded string
        String input = "refer";

        System.out.println("==========================================");
        System.out.println("Use Case 7 - Deque Based Palindrome Check");
        System.out.println("Input String : " + input);

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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