public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 10};
        int x = 7;

        int[] result = searchRange(arr, x);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    // Main function to get both first and last indices
    public static int[] searchRange(int[] arr, int x) {
        int first = findFirst(arr, x);
        int last = findLast(arr, x);
        return new int[]{first, last};
    }

    // Find first occurrence using Binary Search
    public static int findFirst(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                ans = mid;       // possible first occurrence
                right = mid - 1; // keep searching left
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    // Find last occurrence using Binary Search
    public static int findLast(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                ans = mid;       // possible last occurrence
                left = mid + 1;  // keep searching right
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
