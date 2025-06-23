package lesson14;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void basicTest() {
		Calculator	calc = new CalculatorImpl();
		
		Assert.assertEquals(0, calc.getValue(), 0.0001);

		calc = new CalculatorImpl(10);
		
		Assert.assertEquals(10, calc.getValue(), 0.0001);
	}

	@Test
	public void operationTest() {
		Calculator	calc = new CalculatorImpl(10);
		
		Assert.assertEquals(15, calc.add(new CalculatorImpl(5)).getValue(), 0.0001);
		
		try {
			calc.add(null);
			Assert.fail("Mandatory exception was not detected (null 1-st argument)");
		} catch (IllegalArgumentException exc) {
		}
	}
}
