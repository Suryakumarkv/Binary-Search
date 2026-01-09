//The floor of a number x in a sorted array is:
//the largest element in the array less than or equal to x.

public class FloorOfAnArrayNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int x = 8;
        int Floor = FloorOfanElem(arr, x);
        System.out.println("Floor of " + x + " is: " + Floor);
    }

    private static int FloorOfanElem(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == x) {
                return arr[mid];
            } else if(arr[mid] < x) {
                ans = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

