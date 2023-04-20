package ArraysSuchenUndSortieren;
/**
 * hfjsdkf
 * @author Marko Ekmedzic
 * @version 2022-02-23
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        System.out.println(ArraySearch.linearSearch(arr, 6));

        System.out.println(ArraySearch.binarySearch(arr, 8));

        System.out.println(ArraySearch.isSorted(new int[]{1, 3, 2, 4}));

        System.out.println(ArraySearch.searchMin(arr));

        System.out.println(ArraySearch.searchMin(arr, 1, 3));

        System.out.println(ArraySearch.searchMax(arr));

        System.out.println(ArraySearch.searchMax(arr, 2, 4));
    }
}

