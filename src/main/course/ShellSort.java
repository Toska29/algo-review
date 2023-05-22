package main.course;
/** Shell sort is a version of insertion sort but with less shifting. It is also in-place algorithm but unstable algorithm
 * - not preserving ordering of duplicated items */

public class ShellSort {

    public static int[] shellSort(int[] intArray){
        for (int gap = intArray.length/2; gap > 0 ; gap /= 2) {
            for (int i = gap; i < intArray.length ; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j-=gap;
                }

                intArray[j] = newElement;

            }
        }

        return intArray;
    }
}
