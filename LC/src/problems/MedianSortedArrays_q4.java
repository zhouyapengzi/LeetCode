package problems;

import java.util.ArrayList;
 
import java.util.Collections;

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
	
    @SuppressWarnings("unchecked")
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	double answer = 0;
        int n = nums1.length;
        int m = nums2.length;     
    	
        if(n==0) {
     	   if(m % 2 == 0) {
                double temp = Double.valueOf(nums2[m/2 - 1] + nums2[m/2]);
     		   answer = temp/ 2;
     	   }
     	   else {
     		   answer = nums2[(m-1)/2]; 
     	   }    	   
        }
        else if(m == 0) {    	 
     	   if( n % 2 == 0) {
     		   double temp = Double.valueOf(nums1[n/2 -1 ]+ nums1[n/2]);    	    
     		   answer = temp / 2;
     	   }
     	   else {
     		   answer =   nums1[(n-1)/2];
     	   }
        }
        else {
     	   ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < n; i++) {
         	   list.add(nums1[i]);
         	   
            }
            for(int i = 0; i < m; i++) {
         	   list.add(nums2[i]);
            }
            Collections.sort(list);
            int sum = n + m ;
            if(sum % 2 == 0) {
         	  int x = (int) list.get(sum / 2);
         	  int y =  (int) list.get(sum/2 -1);
               
         	  answer = Double.valueOf(x+y) /2;
            }
            else {
         	   int res = (int)list.get((sum-1)/2);
         	   answer = Double.valueOf(res);
            }
        }
        
        return answer;
       
    }


	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4};
 
		int[] nums2 = {};
		double median = findMedianSortedArrays(nums1,nums2);
		System.out.print(median);

	}

}
