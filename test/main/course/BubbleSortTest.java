package main.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



import java.util.Arrays;

class BubbleSortTest {


    @Test
    void sort() {
        //given
        int[] intArray = {20, 35, -15, 55, 1, -22};

        //when
        int[] sortedIntArray = BubbleSort.sort(intArray);

        //then
        assertEquals(-22, sortedIntArray[0]);
        System.out.println(Arrays.toString(sortedIntArray));;
    }
}