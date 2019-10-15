package problems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 

@RunWith(Parameterized.class)
public class FlippingImageTest {
	
	@Parameters
	public static Iterable<Object[]> testdata(){
		int[][]A = {};
		int[][]AExpect = {};
		int[][]B = {{},{}};
		int[][]BExpect = {{},{}};
		int[][]C = {{1,0,0},{1,1,1},{}};
		int[][]CExpect = {{1,1,0},{0,0,0},{}};
		int[][]D = {{1}};
		int[][]DExpect = {{0}};
		int[][]E = {{0}};
		int[][]EExpect = {{1}};
		int[][]F = {{1,1,0},{1,0,0}};
		int[][]FExpect = {{1,0,0},{1,1,0}};
		return Arrays.asList(new Object[][] {
			{A, AExpect},
			{B, BExpect},
			{C, CExpect},
			{D, DExpect},
			{E, EExpect},
			{F, FExpect}
			});
	}
		
	public FlippingImage_832 fl = new FlippingImage_832();
	private int[][] input;
	private int[][] output;
	
	public FlippingImageTest(int[][]in, int[][]out) {
		input = in;
		output = out;
	}
	
	 
	
	
	@Test
	public void test() {	
			assertArrayEquals(output, fl.flipAndInvertImage(input));
	}
	
	

}
