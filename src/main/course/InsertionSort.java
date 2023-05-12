package main.course;

/** InsertionSort is O(n^2).
 * Does not require swap but instead shifting
 * It is a stable sort - preserve the ordering of duplicated item
 * it is also an in-place algorithm */

public class InsertionSort {

    public static int[] insertionSort(int[] intArray){
        for (int firstIndexOfUnsortedArray = 1; firstIndexOfUnsortedArray < intArray.length ; firstIndexOfUnsortedArray++) {
            int elementReservation = intArray[firstIndexOfUnsortedArray];

            int i = firstIndexOfUnsortedArray;

            for (; i > 0 && intArray[i-1]> elementReservation; i--) {
                intArray[i] = intArray[i-1];
            }

            intArray[i] = elementReservation;

        }
        return intArray;
    }
}
