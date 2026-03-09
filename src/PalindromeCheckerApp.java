import java.util.Scanner;


public class PalindromeCheckerApp {

    // Method 1: Using StringBuilder reverse
    public static boolean checkUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Using two-pointer technique
    public static boolean checkUsingTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Using recursion
    public static boolean checkUsingRecursion(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return checkUsingRecursion(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();

        // Two pointer timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingTwoPointer(input);
        long end2 = System.nanoTime();

        // Recursion timing
        long start3 = System.nanoTime();
        boolean result3 = checkUsingRecursion(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("\n--- Performance Comparison ---");

        System.out.println("Reverse Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Recursion Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}

