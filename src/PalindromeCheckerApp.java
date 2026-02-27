public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        boolean isPalindrome = input.equals(reversed);

        // Display output
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }

}
