package recursion;
import java.util.*;
public class FindTheLengthOfAStringWithoutUsingLength {
    static int findLength(String str, int index) {
        try {
            str.charAt(index);
            return 1 + findLength(str, index + 1);
        } catch (StringIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(findLength(str, 0));
    }
}
