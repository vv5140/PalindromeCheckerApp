import java.util.Scanner;




public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        // Normalize string: remove spaces and convert to lowercase
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}
