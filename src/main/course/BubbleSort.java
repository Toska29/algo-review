package main.course;
/** Bubble sort is O(n^2) and is a stable sort - preserve the relative order of duplicated items */
public class BubbleSort {

    public static int[] ascendingOrderSorting(int[] intArray){

        for (int lastIndexOfUnSortedArray = intArray.length -1; lastIndexOfUnSortedArray > 0 ; lastIndexOfUnSortedArray--) {
            for (int i = 0; i < lastIndexOfUnSortedArray; i++) {
                if(intArray[i] != intArray[i+1]) swap(intArray, i);
            }

        }

        return intArray;
    }

    private static void swap(int[] intArray, int i) {
        if(intArray[i] > intArray[i +1]){
            int temp = intArray[i];
            intArray[i] = intArray[i +1];
            intArray[i +1] = temp;
        }
    }

    public static int[] descendingOrderSorting(int[] intArrays){
        for (int firstIndexOfUnsortedArray = 0; firstIndexOfUnsortedArray < intArrays.length; firstIndexOfUnsortedArray++) {
            for (int i = intArrays.length -1; i > firstIndexOfUnsortedArray ; i--) {
                if(intArrays[i] > intArrays[i-1]) descendingSwap(intArrays, i);
            }
        }

        return intArrays;
    }

    private static void descendingSwap(int[] intArrays, int i) {
        int temp = intArrays[i-1];
        intArrays[i-1] = intArrays[i];
        intArrays[i] = temp;
    }

}
