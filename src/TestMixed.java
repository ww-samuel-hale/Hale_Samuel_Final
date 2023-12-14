import java.util.Arrays;

public class TestMixed {
    public boolean testMixed() {
        int[] mixed = {2, -1, 3, -4};
        int[] correct = {-4, -1, 2, 3};
        SelectionSort sorter = new SelectionSort();
        mixed = sorter.selectionSort(mixed); // should return -4, -1, 2, 3
        if (Arrays.equals(mixed, correct)) {
            return true;
        } else return false;
    }
}
