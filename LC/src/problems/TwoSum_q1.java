package problems;

 
import java.util.HashMap;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. 
 */



public class TwoSum_q1 {
	public int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
		if(nums.length == 0) {
			System.out.println("Empty array");
			return result;
		}
		else {
			for(int i = 0; i < nums.length;i++) {
				for(int j = i+1;j < nums.length;j++) {
					if(nums[i] + nums[j] == target) {
						result[0]= i;
						result[1]=j;
						break;
					}	
				}
				
			}
		}
		        
		return result;
    }
	
	public static int[] twoSum_solution2(int[] nums, int target) {
		int result[] = new int[2];
		HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++) {
			numMap.put(nums[i],i);
		}
		
		for(int iter = 0; iter < nums.length; iter++) {
			int tmp = target - nums[iter];
			if(numMap.keySet().contains(tmp) && numMap.get(tmp)!= iter) {
				result[0]= iter;
				result[1]= numMap.get(tmp);
				break;
			}
		}      
		return result;
		
    }
	
	public static int[] twoSum_solution3(int[] nums, int target) {
		int result[] = new int[2];
		HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(numMap.containsKey(complement)) {
				result[0] = numMap.get(complement);
				result[1] = i;
			}
			numMap.put(nums[i], i);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		int nums[] = {3,3,4,5};
		int target = 6;
		int result[] = new int[2];
		result = twoSum_solution3(nums, target);
		System.out.println(result[0] + "," + result[1]);
		
	}

}
