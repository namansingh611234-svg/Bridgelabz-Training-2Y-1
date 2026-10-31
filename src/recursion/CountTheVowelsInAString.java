package recursion;
import java.util.*;
public class CountTheVowelsInAString {
    static int count(String str, int index) {
        if (index == str.length()) {
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(index));

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            return 1 + count(str, index + 1);
        }

        return count(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(count(str, 0));
    }
}
