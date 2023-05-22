package main.course;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void shellSort() {
        //given
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //when
        int[] sortedArray = ShellSort.shellSort(intArray);

        //then
        assertEquals(-22, sortedArray[0]);
        System.out.println(Arrays.toString(sortedArray));
    }
}