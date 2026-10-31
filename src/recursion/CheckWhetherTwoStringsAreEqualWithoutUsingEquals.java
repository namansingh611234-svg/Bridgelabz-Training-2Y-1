package recursion;
import java.util.*;
public class CheckWhetherTwoStringsAreEqualWithoutUsingEquals {
    static boolean check(String s1, String s2, int index) {
        if (index == s1.length() && index == s2.length()) {
            return true;
        }

        if (index >= s1.length() || index >= s2.length()) {
            return false;
        }

        if (s1.charAt(index) != s2.charAt(index)) {
            return false;
        }

        return check(s1, s2, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (check(s1, s2, 0)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }
    }
}
