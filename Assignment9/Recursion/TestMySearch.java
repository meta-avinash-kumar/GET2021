import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMySearch {

	@Test
	public void testCaseForLinear() {
		int result;
		//positive testcase
		result = MySearch.linearSearch(new int[] {1,3,2,4,0},2);
		assertEquals(2,result);	

		//negative testcase
		result = MySearch.linearSearch(new int[] {1,3,2,4,0},7);
		assertEquals(-1,result);	
	}

	@Test
	public void testCaseForBinary() {
		int result;
		//positive testcase
		result = MySearch.binarySearch(new int[] {0,1,2,3,4},0,4,2);
		assertEquals(2,result);
		
		//negative testcase
		result = MySearch.binarySearch(new int[] {0,1,2,3,4},0,4,5);
		assertEquals(-1,result);

	}
}
