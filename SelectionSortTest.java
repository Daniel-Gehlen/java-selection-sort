import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {
    @Test
    public void testSelectionSort() {
        int[] input = {64, 34, 25, 12, 22};
        int[] expected = {12, 22, 25, 34, 64};
        assertArrayEquals(expected, SelectionSort.selectionSort(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, SelectionSort.selectionSort(input));
    }

    @Test
    public void testSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, SelectionSort.selectionSort(input));
    }
}
