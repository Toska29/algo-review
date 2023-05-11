package main.course;
/** Selection sort has less swapping steps than bubble sort. it is still O(n^2) of algorithm complexity.
 * It is an unstable sort - not preserving the relative ordering of duplicated items */

public class SelectionSort {

    public static int[] selectionSort(int[] intArrays){

        for (int lastIndexOfUnsortedArray = intArrays.length-1; lastIndexOfUnsortedArray > 0; lastIndexOfUnsortedArray--) {
            int largestIndex = 0;
            for (int i = 1; i <=lastIndexOfUnsortedArray ; i++) {
                if(intArrays[i] > intArrays[largestIndex]) largestIndex = i;
            }

            swap(intArrays, lastIndexOfUnsortedArray, largestIndex);
        }

        return intArrays;
    }

    private static void swap(int[] intArrays, int lastIndexOfUnsortedArray, int largestIndex) {
        int temp = intArrays[lastIndexOfUnsortedArray];
        intArrays[lastIndexOfUnsortedArray] = intArrays[largestIndex];
        intArrays[largestIndex] = temp;
    }

}
