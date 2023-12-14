import java.util.Arrays;

public class TestPositive {
    public boolean testPositive() {
        int[] positives = {3, 2, 4, 1};
        int[] correct = {1, 2, 3, 4};
        SelectionSort sorter = new SelectionSort();
        positives = sorter.selectionSort(positives); // should return 1, 2, 3, 4
        if (Arrays.equals(positives, correct)) {
            return true;
        } else return false;
    }
}
