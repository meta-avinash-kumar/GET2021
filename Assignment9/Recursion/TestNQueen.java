import static org.junit.Assert.*;
import org.junit.Test;

public class TestNQueen {
	/*
	 * test NQueen when Soln Exist
	 * for 4x4 board
	 */
	@Test
	public void testNQueen_Soln_Exist()
	{
		NQueen queen = new NQueen();
		int result[][]=queen.getNQueenSolution(new int [][] {
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0} });
		int expected[][] ={{0,0,1,0},{1,0,0,0},{0,0,0,1},{0,1,0,0}};
		assertArrayEquals(expected, result);
	}
	
	/*
	 * test NQueen when Soln does not Exist
	 * for 3x3 board
	 */
	@Test
	public void testNQueen_Soln_Not_Exist()
	{
		NQueen queen = new NQueen();
		int [][]result1=queen.getNQueenSolution(new int[][]{{0,0,0},{0,0,0},{0,0,0}});
		int expect[][]={{0,0,0},{0,0,0},{0,0,0}};
		assertArrayEquals(expect, result1); 
	}
	
	/*
	 * test NQueen when throws error
	 */
	@Test(expected = AssertionError.class)
	public void testNQueen_should_Throw_Error()
	{
		NQueen queen = new NQueen();
		queen.getNQueenSolution(new int [][] {
	              { 0,  0,  0,  0},});
	}
	
}
