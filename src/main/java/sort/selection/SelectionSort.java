package sort.selection;

/**
 * @author: Samuel
 * @date: 2021-05-24 13:05
 */
public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[index])
                    index = j;
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {

    }
}
