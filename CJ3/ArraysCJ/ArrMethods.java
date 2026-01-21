package ArraysCJ;

import java.util.Arrays;
import java.util.List;

public class ArrMethods {
    static void main(String[] args) {
        int[] arr = {4,2,7,9,4,2,7,0,7,2,546,9,34,5,58,5,578,69,23,42,34,23,42,5,436,54,7,567};

        // clone exact copy
        int[] cloneArr = arr.clone();
        int cloneArrLen = cloneArr.length;

        // sort the array elements in natural order
        Arrays.sort(cloneArr);

        // fill the elements of the array with specified value
        Arrays.fill(arr, 10);

        //compare two arrays
        boolean isEquals = Arrays.compare(arr, cloneArr) == 0; // return -1, 0, 1
        isEquals = Arrays.equals(arr, cloneArr); // return boolean value

        // search for an element in sorted array
        int idx_target = Arrays.binarySearch(cloneArr, 69);

        // convert the static array into dynamic list
        String[] name = {"abc", "def", "ghi", "jkl"};
        List<String> listArr = Arrays.asList(name);


    }
}
