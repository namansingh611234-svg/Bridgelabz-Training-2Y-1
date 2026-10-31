package recursion;
import java.util.*;
public class CountTheOccurrencesOfAGivenCharacter {
    static int count(String str, char ch, int index) {
        if (index == str.length()) {
            return 0;
        }

        if (str.charAt(index) == ch) {
            return 1 + count(str, ch, index + 1);
        }

        return count(str, ch, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(count(str, ch, 0));
    }
}
