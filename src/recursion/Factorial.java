package recursion;
import java.util.Scanner;
public class Factorial {
    public static long fact(int n) {
        // Base case: 0! and 1! are both 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive step
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + fact(n));
        sc.close();
    }

}
