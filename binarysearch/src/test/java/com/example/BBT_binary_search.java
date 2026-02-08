package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class BBT_binary_search {

    binary_search bs = new binary_search();
@Test
void testLeftElement() {
    ArrayList<Integer> list =
        new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

    int result = bs.binarySearch(list, 0, list.size() - 1, 1);

    assertEquals(0, result);
}

@Test
void testMidElement() {
    ArrayList<Integer> list =
        new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

    int result = bs.binarySearch(list, 0, list.size() - 1, 5);

    assertEquals(2, result);
}


@Test
void testRightElement() {
    ArrayList<Integer> list =
        new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

    int result = bs.binarySearch(list, 0, list.size() - 1, 9);

    assertEquals(4, result);
}

    @Test
    void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        int result = bs.binarySearch(list, 0, list.size() - 1, 3);
        assertEquals(-1, result);
    }

    @Test
    void testDuplicateElements() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3));
        int result = bs.binarySearch(list, 0, list.size() - 1, 2);
        assertTrue(result >= 1 && result <= 3);
    }
}
