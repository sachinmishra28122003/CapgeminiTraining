import org.example.Main;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest{
@Test
void testBubbleSort() {
    int[] arr = {8, 4, 2, 4, 1};
    int[] expected = {1, 2, 4, 4, 8};
    int[] actual = Main.bubbleSort(arr);
    boolean result = Arrays.equals(arr, expected);
//        assertEquals(Arrays.equals(actual,expected),Arrays.equals(expected,actual));\
    assertArrayEquals(expected, actual);
}

@Test
void testBubbleSort2() {
    int[] arr = {1};
    int[] expected = {1};
    int[] actual = Main.bubbleSort(arr);
    assertArrayEquals(expected, actual);
}}