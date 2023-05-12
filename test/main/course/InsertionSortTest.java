package main.course;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void insertionSort() {
        //given
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //when
        int[] sortedArray = InsertionSort.insertionSort(intArray);

        //then
        assertEquals(-22, sortedArray[0]);
        System.out.println(Arrays.toString(sortedArray));
    }
}