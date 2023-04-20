package ArraysSuchenUndSortieren;
import java.sql.SQLOutput;
import java.util.Arrays;
/**
 * Dieses Programm testet die Suchalgorithmen aus ArraySort
 * @author Marko Ekmedzic
 * @version 2023-02-24
 */
public class ArraySortTest {

    public static void main(String[] args) {

        int[] arr = {4, 1, 7, 3, 9, 2, 8, 5, 6};
        System.out.println("Unsortiertes Array: " + Arrays.toString(arr));

        ArraySort.selectionSort(arr);
        System.out.println("SelectionSort: " + Arrays.toString(arr));

        int[] arr2 = {4, 1, 7, 3, 9, 2, 8, 5, 6};
        ArraySort.bubbleSort(arr2);
        System.out.println("BubbleSort: " + Arrays.toString(arr2));

        int[] arr3 = {4, 1, 7, 3, 9, 2, 8, 5, 6};
        ArraySort.bubbleSortOpt(arr3);
        System.out.println("BubbleSortOpt: " + Arrays.toString(arr3));
    }
}
