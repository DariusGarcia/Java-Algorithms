package Algorithms;

import java.util.Random;

public class MergeSort {
    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        // check if array is less than 2 elements
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i=0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i=midIndex; i < inputLength; i++ ){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge two sorted array into one array
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}

// ----------------------- Code to run in Main class: -----------------------

//    Random rand = new Random();
//    int[] numbers = new int[100];
//
//        for (int i = 0; i < numbers.length; i++) {
//        numbers[i] = rand.nextInt(1000000);
//        }
//
//        System.out.println("Before: " + Arrays.toString(numbers));
//
//        mergeSort(numbers);
//
//        System.out.println("After: " + Arrays.toString(numbers));