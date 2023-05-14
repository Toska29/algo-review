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

    public static int[] selectionSortDescendingOrder(int[] intArray){
        for (int firstIndexOfUnsortedArray = 0; firstIndexOfUnsortedArray < intArray.length; firstIndexOfUnsortedArray++) {
            int largestIndex = firstIndexOfUnsortedArray;
            for (int i = firstIndexOfUnsortedArray+1; i < intArray.length ; i++) {
                if(intArray[i] > intArray[largestIndex]){
                    largestIndex = i;
                }
            }
            int temp = intArray[firstIndexOfUnsortedArray];
            intArray[firstIndexOfUnsortedArray] = intArray[largestIndex];
            intArray[largestIndex] = temp;
        }

        return intArray;
    }

}
