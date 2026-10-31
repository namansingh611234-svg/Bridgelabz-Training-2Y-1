package recursion;
import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + addDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits: " + addDigits(n));
        sc.close();
    }
}
