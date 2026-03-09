import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // push characters to stack
        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }

        // reverse string using stack
        String reversed = "";
        while(!stack.isEmpty()){
            reversed = reversed + stack.pop();
        }

        // compare original and reversed
        return input.equalsIgnoreCase(reversed);
    }
}



public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(str);

        if(result){
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}

