package recursion;
import java.util.*;
public class ReplaceEveryOccurrenceOfAWithB {
    static String replace(String str, int index) {
        if (index == str.length()) {
            return "";
        }

        char ch = str.charAt(index);

        if (ch == 'a') {
            ch = 'b';
        }

        return ch + replace(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(replace(str, 0));
    }
}
