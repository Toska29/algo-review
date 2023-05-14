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
        int[] sortedIntArray = BubbleSort.ascendingOrderSorting(intArray);

        //then
        assertEquals(-22, sortedIntArray[0]);
        System.out.println(Arrays.toString(sortedIntArray));;
    }

    @Test
    void testThatElementOfArrayCanBeArrangeInDescendingOrder(){
        //given
        int[] intArray = {20, 35, -15, 55, 1, 7, -22};

        //when
        int[] descendingOrderSorting = BubbleSort.descendingOrderSorting(intArray);

        //then
        assertEquals(55, descendingOrderSorting[0]);
        System.out.println(Arrays.toString(descendingOrderSorting));
    }
}