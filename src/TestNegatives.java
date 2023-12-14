import java.util.Arrays;

public class TestNegatives {
    public boolean testNegative() {
        int[] negatives = {-4, -2, -1, -3};
        int[] correct = {-4, -3, -2, -1};
        SelectionSort sorter = new SelectionSort();
        negatives = sorter.selectionSort(negatives); // should return -4, -3, -2, -1
        if (Arrays.equals(negatives, correct)) {
            return true;
        } else return false;
    }
}
