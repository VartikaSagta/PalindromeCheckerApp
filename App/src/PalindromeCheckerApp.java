import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

          String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                                 .toLowerCase();

        System.out.println("==========================================");
        System.out.println("Use Case 13 - Performance Comparison");
        System.out.println("Input : " + normalized);

        // Benchmark Two Pointer Strategy
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(normalized);
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;

        // Benchmark Stack Strategy
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(normalized);
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;

        // Display Results
        System.out.println("\nTwo Pointer Result : " + result1);
        System.out.println("Execution Time (ns): " + duration1);

        System.out.println("\nStack Strategy Result : " + result2);
        System.out.println("Execution Time (ns): " + duration2);

        System.out.println("==========================================");
    }

    /**
     * Two Pointer Palindrome Check
     */
    private static boolean twoPointerCheck(String s) {

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

    /**
     * Stack Based Palindrome Check
     */
    private static boolean stackCheck(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : s.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}