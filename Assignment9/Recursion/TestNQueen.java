import static org.junit.Assert.*;

import org.junit.Test;

public class TestNQueen {
	@Test
	public void testNQueen()
	{
		NQueen queen = new NQueen();
		int result[][]=queen.getNQueenSolution(new int [][] {
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0} });
//		for (int i = 0; i < result.length; i++) {
//			for (int j = 0; j < result.length; j++) {
//				System.out.print(result[i][j]+" ");
//			}
//			System.out.println();
//		}
		int expected[][] ={{0,0,1,0},{1,0,0,0},{0,0,0,1},{0,1,0,0}};
		assertArrayEquals(expected, result);
		int [][]result1=queen.getNQueenSolution(new int[][]{{0,0,0},{0,0,0},{0,0,0}});
		int expect[][]={{0,0,0},{0,0,0},{0,0,0}};
		assertArrayEquals(expect, result1); 
	}
}
