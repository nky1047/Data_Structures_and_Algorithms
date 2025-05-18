package arrayProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GFG_Problems {

    /**
     * @param arr
     * @return
     */
    public static int findPeak_LinearSearch(int[] arr){

        int n = arr.length;
        for (int i=0; i<n; i++){
            Boolean isLeftOk = (i==0 || arr[i]>arr[i-1]);
            Boolean isRightOk = (i ==n-1 || arr[i]>arr[i+1]);

            if(isLeftOk && isRightOk)
                return i;
        }
        return -1;
    }

    public static int findPeak_BinarySearch(int[] arr){

        int n = arr.length;

        // Edge cases
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        // Binary Search
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int findLargest_LinearSearch(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i])
                largest=arr[i];
        }
        System.out.println(largest);
        return largest;
    }

    public static int findSmallest_LinearSearch(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(smallest>arr[i])
                smallest=arr[i];
        }
        System.out.println(smallest);
        return smallest;
    }

    public static List<Integer> reverseTheArray_1(List<Integer> array){
        int left=0, right =array.size()-1;
        while(left<right){
            Collections.swap(array,left,right);
            left++;
            right--;
        }
        return array;
    }
}
