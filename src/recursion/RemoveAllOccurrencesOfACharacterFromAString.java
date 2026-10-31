package recursion;
import java.util.Scanner;
public class RemoveAllOccurrencesOfACharacterFromAString {
    static String remove(String str, char ch, int index) {
        if (index == str.length()) {
            return "";
        }

        if (str.charAt(index) == ch) {
            return remove(str, ch, index + 1);
        }

        return str.charAt(index) + remove(str, ch, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(remove(str, ch, 0));
    }

}
