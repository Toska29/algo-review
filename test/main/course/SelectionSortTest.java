package main.course;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void selectionSort() {
        //given
        int[] arrays = {20, 35, -15, 7, 55, 1, -22};

        //when
        int[] sortedArray = SelectionSort.selectionSort(arrays);

        //then
        assertEquals(-22, sortedArray[0]);
        System.out.println(Arrays.toString(sortedArray));
    }
}