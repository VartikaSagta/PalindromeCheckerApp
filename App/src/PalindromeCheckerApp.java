import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "racecar";

        System.out.println("==========================================");
        System.out.println("Use Case 3 - Reverse String Palindrome Check");
        System.out.println("Input String : " + input);

        // Build reversed string
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("==========================================");
    }
}