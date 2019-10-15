package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.  
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. 
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 */


/*
 * Step1: for each element of matrix, flip.
 *   array[i] = array[ n-1 - i]
 * Step2: for each element, reverse.
 *    array[i] ^= 1
 */
public class FlippingImage_832 {
	 public int[][] flipAndInvertImage(int[][] A) {
		  
		 if(A.length > 0) {		 
			 int length = A.length;
			 for(int i = 0; i < length; i++) {
				 int[] element = A[i];				  
				 if(A[i].length < 1) {
					 continue;
				 }
				 else {
					 A[i] = reverse(flip(element));
				 }				  
			 }
		 }
		 
	     return A;   
	    }
	 
	 public int[] flip(int[]array) {
		 int[] answer = new int[array.length];
		 if(array.length > 0) {
			 for(int i = 0; i < array.length; i ++) {
				 answer[i] = array[array.length-1-i];
			 }
		 }		
		 return answer;		 
	 }
	 
	 public int[] reverse(int[]array) {
		 int[] answer = new int[array.length];
		 if(array.length > 0) {
			 for(int i = 0; i < array.length; i++) {
				 answer[i] = array[i]^1;
			 }
		 }	 
		 return answer;		 
	 }
	 	 
	 
}

 
