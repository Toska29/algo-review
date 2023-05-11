package main.course;

public class BubbleSort {

    public static int[] sort(int[] intArray){

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


}
