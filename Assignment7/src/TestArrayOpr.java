import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Test Unit class
 * @author avinash.kumar_metacu
 *
 */
public class TestArrayOpr {
	/*
	 * Test count clumps
	 */
	@Test
	public void testCaseForCountClumps() {
		int res;
		res = ArrOperation.countClumps(new int[] {1,1,2,1,1});
		assertEquals(res,2);

		res = ArrOperation.countClumps(new int[] {1,1,1,1,1});
		assertEquals(res,1);

		res = ArrOperation.countClumps(new int[] {1,2,3,4});
		assertEquals(res,0);

		res = ArrOperation.countClumps(new int[] {1,2,3,4,5,5});
		assertEquals(res,1);

		res = ArrOperation.countClumps(new int[] {1,2,2,3,4});
		assertEquals(res,1);


		res = ArrOperation.countClumps(new int[] {1,2,3,3,5,5,6});
		assertEquals(res,2);
	}
	
	/*
	 * Test Split Array
	 */
	@Test
	public void testCaseForSplitArray()
	{

		int result = ArrOperation.splitArray(new int[]{1,1,1,2,1 });
		assertEquals(result,3);

		result = ArrOperation.splitArray(new int[]{2,1,1,2,1 });
		assertEquals(result,-1);

		result = ArrOperation.splitArray(new int[]{10,10 });
		assertEquals(result,1);


	}

	/*
	 * Test FixXY
	 */
	@Test
	public void testCaseForfixXY()
	{
		int result[] = ArrOperation.fixXY(new int[]{5,4,9,4,9,5 },4,5);
		int expected[]=new int[]{9, 4, 5, 4, 5, 9};
		assertArrayEquals(result,expected);

		result= ArrOperation.fixXY(new int[]{1,4,1,5},4,5);
		expected=new int[]{1,4,5,1};
		assertArrayEquals(result,expected);

		result= ArrOperation.fixXY(new int[]{1, 4, 1, 5, 5, 4, 1},4,5);
		expected=new int[]{1, 4, 5, 1, 1, 4, 5};
		assertArrayEquals(result,expected);

		result= ArrOperation.fixXY(new int[]{5,5,4,9,4,9,4,9,5},4,5);
		expected=new int[]{9,9,4,5,4,5,4,5,9};
		assertArrayEquals(result,expected);

	}
	
	/*
	 * Test Mirror method
	 */
	@Test
	public void testCaseForMirror()
	{
		int result = ArrOperation.mirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1});
		assertEquals(result,3);
		result = ArrOperation.mirror(new int[]{7, 1, 4, 9, 7, 4, 1});
		assertEquals(result,2);
		result = ArrOperation.mirror(new int[]{1, 2, 1, 4});
		assertEquals(result,3);
		result = ArrOperation.mirror(new int[]{7, 7, 7, 7, 6, 7, 7});
		assertEquals(result,5);

	}

}




