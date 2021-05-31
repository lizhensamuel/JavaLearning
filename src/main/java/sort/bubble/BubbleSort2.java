package sort.bubble;

/**
 * @author: Samuel
 * @date: 2021-05-24 13:01
 */
public class BubbleSort2 {
    public static void bubbleSort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
