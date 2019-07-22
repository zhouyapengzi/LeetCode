package problems;

public class reverse_q7 {
 
	 public  int reverse(int x) {
		 long answer = 0;
		 //return 0 when result overflow the 32-bit signed integer range
		 double min = -Math.pow(2, 31);
		 double max = Math.pow(2, 31) - 1;
		
		 
		 if(x > max || x < min) {
			return 0;
		 }
		 
		 while(x != 0) {
			 int pop = x % 10;
			 x = x / 10;	 		 
			 answer = answer*10 + pop;
			 if(answer > max || answer < min) {
					return 0;
				 }
		 }		 
		 
		 if( x < 0 ) {
			 answer = answer * (-1);
		 }
		 		 	 
		 return (int)answer;
	        
	    }
	 
	 public static void main(String[] args) {
		reverse_q7 rqv = new reverse_q7();
		System.out.println(rqv.reverse(1534236469)); 
	 }

	

}
