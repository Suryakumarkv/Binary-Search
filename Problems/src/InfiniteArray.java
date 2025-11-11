import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
       int arr[] = {2,3,5,6,7,8,9,10,11,12,15,20,23,30};
       int target = 15;
       System.out.println(ans(arr, target));
    }

    public static int ans(int arr[], int target) {
        //Initial boxing
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart= end+1;
              //for end double the size next to it
            //end = prevEnd + size of the box * 2
            end = end + (end-start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }


    public static int binarySearch(int[] arr, int x,int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                return mid;
                 // keep searching left
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
