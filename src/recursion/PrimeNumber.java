package recursion;

public class PrimeNumber {
    public static void print(int n) {
        if (n != 0) {
            print(n - 1);
            if (isPrime(n)) {
                System.out.print(n + " ");
            }

        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)n); ++i) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        print(100);
    }
}
