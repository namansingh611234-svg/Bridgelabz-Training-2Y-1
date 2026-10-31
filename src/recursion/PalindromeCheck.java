package recursion;
import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isPalindrome(String s, int left, int right) {
        // Base case: if pointers cross or meet, it's a palindrome
        if (left >= right) {
            return true;
        }
        // If characters don't match, it's not a palindrome
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        // Recursive step: move towards the center
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println("Is \"" + str + "\" a palindrome? " + result);
    }
}
