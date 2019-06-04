package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianSortedArrays_q4 {
/*	There are two sorted arrays nums1 and nums2 of size m and n respectively.

	Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

	You may assume nums1 and nums2 cannot be both empty.

	Example 1:

	nums1 = [1, 3]
	nums2 = [2]

	The median is 2.0
	Example 2:

	nums1 = [1, 2]
	nums2 = [3, 4]

	The median is (2 + 3)/2 = 2.5*/
	
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
       double answer = 0;
       int n = nums1.length;
       int m = nums2.length;
       if(n==0) {
    	   if(m%2 == 0) {
    		   answer = (nums2[m/2 - 1] + nums2[m/2])/ 2;
    	   }
    	   else {
    		   answer = nums2[(m-1)/2]; 
    	   }
    	   
       }
       if(m == 0) {
    	  answer = (n % 2) == 0 ? (nums1[n/2-1] + nums1[n/2])/2 : nums1[(n-1)/2];
       }
       
       ArrayList combine = new ArrayList();
       for(int i : n) {
    	   
       }
       
       return answer;
       
    }


	public  void main(String[] args) {
		int[] nums1 = {1,2,3,4};
		int nums2[] = {3,4};
		double median = findMedianSortedArrays(nums1,nums2);
		System.out.print(median);

	}

}
