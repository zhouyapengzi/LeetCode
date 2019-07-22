package problems;

import java.util.ArrayList;
import java.util.List;

public class zigzag_q6 {
	
    public static String convert(String s, int numRows) {
	    	String answer="";
	    	int sLength = s.length();
	    	char[][] matrix = new char[numRows][s.length()];
	    	int row = 0,column = 0,count = 0, increase = 1;
	    	if(numRows > s.length()) {
	    		answer = s;
	    	}
	    	else if(numRows == 1) {
	    		answer = s;
	    	}
	    	else{
	    		for(int pos = 0; pos < sLength; pos++) {
		    		count++;
		    		if(count == numRows) {
		    			count = 1;
		    			increase = increase*(-1);
		    		}
		    		    
		    		char c = s.charAt(pos);   
		    		
		    		matrix[row][column] = c;
		    		System.out.println("[row][column]:"+ row+","+ column + ": "+ matrix[row][column]);
		    		
		    		row = row + increase;
		    		if(increase == -1) {
		    			column = column + 1;
		    		}
		    				
		    	}
		    	
		    	for(int i = 0; i < numRows; i++) {
		    		for(int j = 0; j < column; j++) {
		    			System.out.println("[i][j]:"+ i+","+ j + ": "+ matrix[i][j]);
		    			answer = answer + matrix[i][j];
		    		}
		    	}
	    		
	    	}	    		    	
	    	
	    	return answer;      
    }

    public static String convert_2(String s, int numRows) {
    	String answer = "";
    	StringBuilder str = new StringBuilder();
    	if(numRows > s.length()) {
    		answer = s;
    	}
    	else if(numRows == 1) {
    		answer = s;
    	}
    	else{
    		List<StringBuilder> rows = new ArrayList<>();
    		boolean down = false;
    		for(int i = 0; i < numRows; i++) {
    			rows.add(new StringBuilder());
        		}
    		int curRow = 0;
    		for(int j = 0; j < s.length(); j++) {
    			rows.get(curRow).append(s.charAt(j));
    			if(curRow == 0 || curRow == numRows-1) {
    				down = !down;
    			}
    			curRow += down? 1: -1;
        	}
    		for(StringBuilder row: rows) {
    			str.append(row);
    		}
    		answer = str.toString();
    	}	
    	
    	return answer;  
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int numRows = 3;
		
		String ans = convert_2(s,numRows);
		System.out.println(ans);

	}

}
