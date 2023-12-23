package Algorithms;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // target not found
    }
}

// ------------------- Code to run in Main file: -------------------

//    int[] array = { 0,2,3,5,22,23,46,199,300};
//    int target = 30;
//
//    int result = LinearSearch.linearSearch(array, target);
//
//        if (result != -1) {
//                System.out.println("Target " + target + " found at: " + result);
//                } else {
//                System.out.println("Target not found.");
//                }
