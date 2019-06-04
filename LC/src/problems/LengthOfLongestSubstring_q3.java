package problems;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring_q3 {

	public static int lengthOfLongestSubstring(String s) {
		int length = 0;
		
		for(int i = 0; i< s.length(); i++) {
			String subString = "";
			for(int j= i; j< s.length(); j++) {
				char c = s.charAt(j);
				int subLen = 0;
				if(subString.indexOf(c)== -1) {
					subString = subString + c;
					subLen = subString.length();
					if(length < subLen) {
						length = subLen;
					}				
			   }
				else {
					break;
				}
			}		
		}		
			
		return length;        
    }
	
	public static int lengthOfLongestSubstring_solution2(String s) {
		int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;       
    }
	
	public static void main(String[] args) {
		String s = "ab";
		System.out.println(lengthOfLongestSubstring_solution2(s));
		
		
	}

}
