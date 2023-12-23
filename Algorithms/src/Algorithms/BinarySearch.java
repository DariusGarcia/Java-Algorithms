package Algorithms;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                start = mid + 1; // search the right half
            } else {
                end = mid - 1; // search the left half
            }
        }
        return -1; // target not found
    }
}
// ------------------- Code to run in Main file: -------------------

//    int[] array = {0, 2, 8, 9, 10, 10, 11, 12, 82, 100};
//    int target = 111;
//
//    int result = BinarySearch.binarySearch(array, target);
//
//        if (result != -1) {
//                System.out.println("Target, " + array[result] + " found at index: " + result);
//                } else {
//                System.out.println("Target not found in the array.");
//                }