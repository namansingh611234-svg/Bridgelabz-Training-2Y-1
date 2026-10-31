package recursion;
import java.util.Scanner;
public class RemoveDuplicateCharactersFromAString {
    static boolean isPresent(String str, char ch, int index) {
        if (index == str.length()) {
            return false;
        }

        if (str.charAt(index) == ch) {
            return true;
        }

        return isPresent(str, ch, index + 1);
    }

    static String remove(String str, int index, String result) {
        if (index == str.length()) {
            return result;
        }

        char ch = str.charAt(index);

        if (!isPresent(result, ch, 0)) {
            result = result + ch;
        }

        return remove(str, index + 1, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(remove(str, 0, ""));
    }
}
