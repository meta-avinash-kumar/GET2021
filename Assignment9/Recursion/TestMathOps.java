import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Test Unit class
 * @author avinash.kumar_metacu
 *
 */
public class TestMathOps {
	/*
	 * Test HCF method
	 */
	@Test
	public void testHcf()
	{
		int result;
		result = MathOps.getHCF(5, 10);
		assertEquals(5, result);	
	}
	
	/*
	 * test LCM method
	 */
	@Test
	public void testLcm()
	{
		int result;
		result = MathOps.getLCM(15, 10);
		assertEquals(30, result);	
	}
}
