package arrayProblems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test_GFG_Problems {

     GFG_Problems gfgProblems;

     int mainArr[] = {10,12,45,23,5,23,23,66,23,47,77};

    @Test
    void findPeak1() {
        int arr[] = {1, 2, 4, 5, 7, 8, 3};
        int result = gfgProblems.findPeak_LinearSearch(arr);
        System.out.println(result);
        assertEquals(5, result);
    }
    @Test
    void findPeak2() {
        int arr[] = {5, 5, 5, 5, 5};
        int result = gfgProblems.findPeak_LinearSearch(arr);
        System.out.println(result);
        assertEquals(-1, result);
    }
    @Test
    void findPeak3() {
        int arr[] = {5, 10, 20, 15, 7, 6};
        int result = gfgProblems.findPeak_LinearSearch(arr);
        System.out.println(result);
        assertEquals(2, result);
    }
    @Test
    void findPeak4() {
        int arr[] = {1, 2, 4, 5, 7, 8, 3};
        int result = gfgProblems.findPeak_LinearSearch(arr);
        System.out.println(result);
        assertEquals(5, result);
    }

    @Test
    void findPeak5() {
        int arr[] = {5, 5, 5, 5, 5};
        int result = gfgProblems.findPeak_BinarySearch(arr);
        System.out.println(result);
        assertEquals(-1, result);
    }
    @Test
    void findPeak6() {
        int arr[] = {5, 10, 20, 15, 7, 6};
        int result = gfgProblems.findPeak_BinarySearch(arr);
        System.out.println(result);
        assertEquals(2, result);
    }
    @Test
    void findPeak7() {
        int arr[] = {1, 2, 4, 5, 7, 8, 3};
        int result = gfgProblems.findPeak_BinarySearch(arr);
        System.out.println(result);
        assertEquals(5, result);
    }

    @Test
    void findLargest_LinearSearch(){
        gfgProblems.findLargest_LinearSearch(mainArr);
    }

    @Test
    void findLargest_LinearSearch_custom(){
        int arr[] = {1, 2, 4, 5, 7, 8, 3};
        gfgProblems.findLargest_LinearSearch(arr);
    }

    @Test
    void findSmallest_LinearSearch() {
        int arr[] = {1, 2, 4, 5, 7, 8, 3};
        gfgProblems.findSmallest_LinearSearch(arr);
    }

    @Test
    void reverseTheArray_1(){
        int mainArr[] = {10,12,45,23,5,23,23,66,23,47,77};
        List<Integer> arr = Arrays.asList(mainArr);
        List<int[]> result = gfgProblems.reverseTheArray_1(mainArr);
        System.out.println(result);
        for(int i=0; i<result.size()-1; i++){
            System.out.println(result.get(i));
        }

    }



}