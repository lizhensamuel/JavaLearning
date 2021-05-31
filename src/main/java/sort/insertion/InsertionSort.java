package sort.insertion;

/**
 * @author: Samuel
 * @date: 2021-05-24 13:07
 */
public class InsertionSort {
    public static void insertionSort(int[] array) {
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
    }

    public static void main(String[] args) {

    }
}
