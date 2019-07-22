package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class reverse_q7Test {
	@Parameters
	public static Collection<Integer[]> inputNumbers() {
		return Arrays.asList(new Integer[][]{
			{123, 321},
			{129, 921},
			{120, 21}
		});
	}
	
	private int input;
	private int output;
	public reverse_q7 rev;
	
	//public constructor that takes in what is equivalent to one "row" of test data.
	public reverse_q7Test(int in, int out) {	
		 input = in;	 
		 output = out;
	}
		
	@Test
	public void test() {
		assertEquals(1,1);
		System.out.println("Input Number is : " + input);
		assertEquals(output, rev.reverse(input));
	}

}
