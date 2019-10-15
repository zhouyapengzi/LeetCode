package problems;

import java.util.ArrayList;
import java.util.List;

/*
 * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of
 *  only the integers that appeared in all three arrays.
 * Example 1:
 * Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
 * Output: [1,5]
 * Explanation: Only 1 and 5 appeared in the three arrays.
 * 
 * Constraints:
 * 1 <= arr1.length, arr2.length, arr3.length <= 1000
 * 1 <= arr1[i], arr2[i], arr3[i] <= 2000
 */
public class Intersection_of_Three_Sorted_Arrays_5079 {
	
	 public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
	        List<Integer> result = new ArrayList<Integer>();
	        List<Integer> arr1List = new ArrayList<Integer>();
	        List<Integer> arr2List = new ArrayList<Integer>();
	        List<Integer> arr3List = new ArrayList<Integer>();
	        for(int i = 0; i < arr1.length; i++) {
	        	arr1List.add(arr1[i]);
	        }
	        for(int j = 0; j < arr2.length; j++) {
	        	arr2List.add(arr2[j]);
	        }
	        for(int m = 0; m < arr3.length; m++) {
	        	arr3List.add(arr3[m]);
	        }
	        arr1List.retainAll(arr2List);
	    	        
	        arr1List.retainAll(arr3List);
	      
	        result = arr1List;	
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {1,2,3,4,5};
		 int[] arr2 = {1,2,5,7,9}; 
		 int[] arr3 = {1,3,4,5,8};
		 
		 List<Integer> result = arraysIntersection(arr1,arr2,arr3);
		 System.out.println(result);

	}

}
