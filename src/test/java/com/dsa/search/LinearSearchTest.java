package com.dsa.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    @Test
    public void testSearch() {
        LinearSearch linearSearch = new LinearSearch();
        int[] input = {1,2,3,5,6,7,8,0};

        int searchedIndex = linearSearch.searchIndex(input, 1);
        assertEquals(0,searchedIndex);
    }

    //unhappy scenarios/case
    @Test
    public void testNotFoundSearch() {
        LinearSearch linearSearch = new LinearSearch();
        int[] input = {1,2,3,5,6,7,8,0};

        int searchedIndex = linearSearch.searchIndex(input, 110);
        assertEquals(-1,searchedIndex);
    }

    @Test
    public void testEdgeCase() {
        LinearSearch linearSearch = new LinearSearch();
        int[] input = {1,2,3,5,6,7,-4,0};

        int searchedIndex = linearSearch.searchIndex(input, -4);
        assertEquals(6,searchedIndex);
    }
}
