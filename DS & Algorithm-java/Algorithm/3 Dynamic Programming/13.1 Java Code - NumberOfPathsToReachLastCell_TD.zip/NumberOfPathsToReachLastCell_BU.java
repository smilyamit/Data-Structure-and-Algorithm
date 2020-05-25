package dynamicProgramming;
import node.NumberOfPathsNode;

public class NumberOfPathsToReachLastCell_BU {
	
	public void numberOfPaths(int array[][], int numberOfRow, int numberOfCol, int costToReachLastCell) {
		NumberOfPathsNode[][] dp = new NumberOfPathsNode[numberOfRow][numberOfCol];
		
		//insert 'null' value for last row and col
		for(int row=0; row<numberOfRow; row++ ) {
			dp[row][numberOfCol-1] = null;
		}
		for(int col=0; col<numberOfCol; col++) {
			dp[numberOfRow-1][col] = null;
		}
		
		//Do calculation for all the cells of dp array
		for(int row=numberOfRow-2; row>=0; row-- ) {
			for(int col=numberOfCol-2; col>=0; col--) {
				
				System.out.println("Current Row: " + row + "  " + col);
				NumberOfPathsNode tmp = new NumberOfPathsNode(array[row][col], dp[row][col+1], dp[row+1][col], costToReachLastCell);
				tmp.calculateNumberOfWaysSatifyingRightCell();
				tmp.calculateNumberOfWaysSatifyingDownCell();
				tmp.setNumberOfWaysToComeHereFromRightOrDown();
				dp[row][col] = tmp;
				System.out.println("\n\n");
				try {Thread.sleep(1 * 1000); } catch (InterruptedException e) {e.printStackTrace();
				}
			}//end of loop
		}//end of loop
		System.out.println("Number of Ways to reach last Cell: " + dp[0][0].getnumberOfWaysToReachLastCellFromHere());
	}//end of method
	
	
	//Main method
	public static void main(String[] args) {
		int[][] array = { { 4, 7, 1, 6 }, 
						  { 5, 7, 3, 9 }, 
						  { 3, 2, 1, 2 }, 
						  { 7, 1, 6, 3 } };
		int costToReachLastCell = 25;
		NumberOfPathsToReachLastCell_BU nop = new NumberOfPathsToReachLastCell_BU();
		nop.numberOfPaths(array, array.length + 1, array[0].length + 1, costToReachLastCell);
	}//end of method

}//end of class