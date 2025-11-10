//Ceiling of a number -> Smallest Element in array that is greater or equal to target element
//if element is present then retuen it or return start instead -1 from binary Search

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int x = 15;
        int ceiling = findCeiling(arr, x);
        System.out.println("Ceiling of " + x + " is: " + ceiling);
    }

    private static int findCeiling(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == x) {
                return mid;
            } else if(arr[mid] > x) {
                ans = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
}
