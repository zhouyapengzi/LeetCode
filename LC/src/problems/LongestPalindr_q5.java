package problems;

public class LongestPalindr_q5 {
    public static String longestPalindrome(String s) {
	  String ans = "";
	  if(s==null || s.length()<1) {
		  return "";
	  }else if(s.length()==1) {
		  return s;
	  }
	 	 
	  for(int i = 0; i < s.length()-1; i++) {
		  for(int j = i+1; j <= s.length(); j++) {
			  String str = s.substring(i, j);
			  String str_reverse = reverseString(str);
			  if(str.equals(str_reverse) && ans.length()<str.length()) {
				 ans = str; 
			  }
		  }
	  }
	
	  return ans;        
    }
    
    public static String reverseString(String str) {
    	String str_reverse = "";
    	
    	for(int i=str.length()-1; i>=0; i--) {
    		str_reverse = str_reverse + str.charAt(i);
    	}
    	//System.out.println(str_reverse);
    	return str_reverse;
    	
    }
    
    public static String longestPalindrome_2(String s) {
  	  String ans = "";
  	  if(s==null || s.length()<1) {
		  return "";
	  }else if(s.length()==1) {
		  return s;
	  }else if(s.length()==2) {
		  if(s.charAt(0)==s.charAt(1)) {
			  return s;
		  }else {
			  return String.valueOf(s.charAt(0));
		  }
	  }
  	  
  	 
  	  int length = 0;
  	  for(int i = 0; i < s.length()-1; i++) {		  
  		  String palindromicOdd = expandAroundCenter(s,i,i);
  		  String palindromicEven = expandAroundCenter(s,i,i+1);
  		  int maxLength = Math.max(palindromicOdd.length(), palindromicEven.length());
  		  if(length < maxLength) {
  			 length = maxLength;
  			 if(maxLength == palindromicOdd.length()) {
  				 ans = palindromicOdd;
  			 }
  			 else {
  				 ans = palindromicEven;
  			 }
  		  }	  
  	  }
  	  return ans;
    }
    
    private static String expandAroundCenter(String s, int left, int right) {
    	String palindromic = "";
    	int start = left;
    	int end = right;
    	while( start >=0 && end <s.length() && s.charAt(start) == s.charAt(end) ) {
    		start--;
    		end++;
    	} 	
    	palindromic = s.substring(start+1, end );
    	//System.out.println(start + "," + end+ "," +palindromic );
    	return palindromic;
    }
    

	public static void main(String[] args) {
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		String ans = longestPalindrome_2(s);
		System.out.println(ans);
		
		/*String test = "01234";
		System.out.println(test.substring(0, 1));
		System.out.println(test.substring(0, 4));*/

	}

}
