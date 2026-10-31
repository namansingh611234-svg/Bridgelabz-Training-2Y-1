package recursion;

public class LinearSearchRecursion {

        public static int linearSearch(int[] arr, int target, int index) {
            // Base case: if index reaches the end, element is not found
            if (index == arr.length) {
                return -1;
            }
            // If element is found, return its index
            if (arr[index] == target) {
                return index;
            }
            // Recursive step: check the next index
            return linearSearch(arr, target, index + 1);
        }

        public static void main(String[] args) {
            int[] arr = {10, 23, 45, 70, 11, 15};
            int target = 70;
            int result = linearSearch(arr, target, 0);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }

