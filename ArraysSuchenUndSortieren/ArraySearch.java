package ArraysSuchenUndSortieren;
/**
 * hfjsdkf
 * @author Marko Ekmedzic
 * @version 2022-02-23
 */
public class ArraySearch {

    public static int linearSearch(int[] arr, int position) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == position) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int position) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == position) {
                return mid;
            } else if (arr[mid] < position) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static int searchMin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int searchMin(int[] arr, int start, int ende) {
        int minIndex = start;
        for (int i = start + 1; i <= ende; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int searchMax(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int searchMax(int[] arr, int start, int ende) {
        int maxIndex = start;
        for (int i = start + 1; i <= ende; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}

