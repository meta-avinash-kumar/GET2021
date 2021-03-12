import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMySearch {

	/*
	 * Test when value exist in array
	 */
	@Test
	public void testCaseForLinear_shouldBe2() {
		int expected = 2,result;
		//positive testcase
		result = MySearch.linearSearch(new int[] {1,3,2,4,0},2);
		assertEquals(expected,result);	
	}
	
	/*
	 * Test when value does not exist in array
	 */
	@Test
	public void testCaseForLinear_shouldBeNeg() {
		int expected = -1,result;
		//positive testcase
		result = MySearch.linearSearch(new int[] {1,3,2,4,0},7);
		assertEquals(expected,result);	
	}
	
	
	/*
	 * Test when value exist in array
	 */
	@Test
	public void testCase_For_Binary_should_Be2() {
		//positive testcase
		int expected = 2, result;
		result = MySearch.binarySearch(new int[] {0,1,2,3,4},0,4,2);
		assertEquals(expected,result);
	}
	
	/*
	 * Test when value does not exist in array
	 */
	@Test
	public void testCase_For_Binary_should_Be_Neg() {
		//negative testcase
		int expected = -1, result;
		result = MySearch.binarySearch(new int[] {0,1,2,3,4},0,4,5);
		assertEquals(expected,result);

	}
}
