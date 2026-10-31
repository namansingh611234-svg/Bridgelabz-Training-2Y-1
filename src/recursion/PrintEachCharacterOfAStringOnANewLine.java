package recursion;
import java.util.*;
public class PrintEachCharacterOfAStringOnANewLine {
    static void print(String str, int index) {
        if (index == str.length()) {
            return;
        }

        System.out.println(str.charAt(index));

        print(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        print(str, 0);
    }

}
