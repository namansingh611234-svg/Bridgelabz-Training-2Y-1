package recursion.AdvanceRecursion;

public class TowerOfHanoi {
    // Function to find the minimum number of moves
    public static int towerOfHanoi(int n, int from, int to, int aux) {
        int moves = 0;

        // Base case: No disks require no moves
        if (n >= 1) {
            // Move n-1 disks from the starting rod to the auxiliary rod
            moves += towerOfHanoi(n - 1, from, aux, to);

            // Move the largest disk to the target rod
            moves++;

            // Move n-1 disks from the auxiliary rod to the target rod
            moves += towerOfHanoi(n - 1, aux, to, from);
        }

        // Return the total number of moves
        return moves;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(towerOfHanoi(n, 1, 3, 2));
    }
}

