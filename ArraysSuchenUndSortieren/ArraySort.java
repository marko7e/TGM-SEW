package ArraysSuchenUndSortieren;
/**
 * Diese Methode beinhaltet Methoden, um Arrays mit Algorithmen zu sortieren
 * @author Marko Ekmedzic
 * @version 2023-02-24
 */
public class ArraySort {
    /**
     * Sortiert mithilfe von SelectionSort
     * @param arr der Array der sortiert wird
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Sortiert ein Array mit dem BubbleSort Algorithmus
     * @param arr der Array der sortiert wird
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * Sortiert ein Array mit dem optimierten Bubblesort Algorithmus
     * @param arr der Array der sortiert wird
     */
    public static void bubbleSortOpt(int[] arr) {
        int n = arr.length;
        boolean tauschen;
        for (int i = 0; i < n-1; i++) {
            tauschen = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    tauschen = true;
                }
            }
            if (!tauschen) {
                break;
            }
        }
    }
}
