package recursion;

public class ArraySortedCheck {
    public static boolean isSorted(int[] arr, int index) {
        // Base case: if we reach the last element or array is empty
        if (index == arr.length - 1 || arr.length == 0) {
            return true;
        }
        // If current element is greater than the next, it's not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Recursive step: check the next pair
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        System.out.println("Is arr1 sorted? " + isSorted(arr1, 0));
        System.out.println("Is arr2 sorted? " + isSorted(arr2, 0));
    }
}
