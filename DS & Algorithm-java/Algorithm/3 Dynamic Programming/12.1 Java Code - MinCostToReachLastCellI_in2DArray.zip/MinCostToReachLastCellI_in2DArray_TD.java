package dynamicProgramming;

public class MinCostToReachLastCellI_in2DArray_TD {

	public int findMinCost(int[][] array, int row, int col) {
		int[][] dp = new int[row+1][col+1];
		return findMinCost_aux(dp, array, row, col);
	} // end of method

	
	public int findMinCost_aux(int[][] dp, int[][] array, int row, int col) {
		if (row == -1 || col == -1) { // BASE CASE
			return Integer.MAX_VALUE;
		}
		if (row == 0 && col == 0) { // BASE CASE: If we're at first cell (0, 0),then no need to recurse
			return array[0][0];
		}
		if(dp[row][col] == 0) {//If we have not solved this problem previously, only then solve it
			int minCost1 = findMinCost_aux(dp, array, row - 1, col);// Case#1: Get min cost if we go 'up' from current cell
			int minCost2 = findMinCost_aux(dp, array, row, col - 1);// Case#2: Get min cost if we go 'left' from current cell
			int minCost = Integer.min(minCost1, minCost2);
			int currentCellsCost = array[row][col];
			dp[row][col] = minCost + currentCellsCost;
		}
		return dp[row][col];
	}// end of method

	
	public static void main(String[] args) {
		int[][] array =
			{
				{ 4, 7, 8, 6, 4 },
				{ 6, 7, 3, 9, 2 },
				{ 3, 8, 1, 2, 4 },
				{ 7, 1, 7, 3, 7 },
				{ 2, 9, 8, 9, 3 }
			};
		MinCostToReachLastCellI_in2DArray_TD mctrlc = new MinCostToReachLastCellI_in2DArray_TD();
		System.out.print("The minimum cost is " + mctrlc.findMinCost(array, array.length - 1, array[0].length - 1));
	}// end of method
}// end of class