package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorMainTest {

	@Test
	public void testAdd() {
		CalculatorMain cal = new CalculatorMain();
		int a = 1;
		int b = 2;
		int expected = 3;
		int actual = cal.add(a, b);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testSubtract() {
	    CalculatorMain calculator = new CalculatorMain();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.sub(b, a);
	 
	    int expected = 4444;
	 
	    assertEquals(expected, actual);
	}

}
