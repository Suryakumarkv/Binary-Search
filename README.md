 Binary Search Problems in Java

This project contains simple Java programs that use **Binary Search** and its variations to solve common problems.


 What is Binary Search?

Binary Search is a fast way to find an element in a **sorted array**.  
It works by repeatedly dividing the search range in half until the target element is found or the range becomes empty.


 🧩 Problems Included

1. Basic Binary Search  
2. Find First and Last Occurrence  
3. Find Floor and Ceil of a Number  
4. Search in Rotated Sorted Array  
5. Square Root using Binary Search  
6. Peak Element Problem  
7. Binary Search on Answer (e.g., Allocate Books, Aggressive Cows)

---

 💻 Example Code

```java
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 8;
        int result = search(arr, target);
        System.out.println("Element found at index: " + result);
    }
}
