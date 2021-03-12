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
	public void testHcf_5_10_shouldBe_5()
	{
		int  expected = 5, result;
		result = MathOps.getHCF(5, 10);
		assertEquals(expected, result);	
	}
	@Test
	public void testHcf_8_9_shouldBe_1()
	{
		int expected = 1, result;
		result = MathOps.getHCF(8, 9);
		assertEquals(expected, result);	
	}
	/*
	 * Test HCF method for negative values
	 * should throw error
	 */
	@Test(expected = AssertionError.class)
	public void testHcf_negative_shouldThrowError()
	{
		MathOps.getHCF(-5, 10);
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
	
	/*
	 * Test LCM method for negative values
	 * should throw error
	 */
	@Test(expected = AssertionError.class)
	public void testLcm_negative_shouldThrowError()
	{
		MathOps.getLCM(-5, 10);
	}
	
}
