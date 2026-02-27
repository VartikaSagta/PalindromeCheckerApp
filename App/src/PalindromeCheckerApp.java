import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

         String input = "civic";

        System.out.println("==========================================");
        System.out.println("Use Case 8 - LinkedList Based Palindrome Check");
        System.out.println("Input String : " + input);

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare elements from both ends
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
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