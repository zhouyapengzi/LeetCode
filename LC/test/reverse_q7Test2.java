package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class reverse_q7Test2 {
	public reverse_q7 rev = new reverse_q7();
	@Parameters
	  public static Iterable<Object[]> data() {
	      return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 120, 21 },
	                 { 123, 321 }, { -14, -41 } });
	  }
	  
	  @Parameter(0)
	  public int fInput;

	  @Parameter(1)
	  public int fExpected;

	  @Test
	  public void test() {
	      assertEquals(fExpected, rev.reverse(fInput));
	  }
	 }


