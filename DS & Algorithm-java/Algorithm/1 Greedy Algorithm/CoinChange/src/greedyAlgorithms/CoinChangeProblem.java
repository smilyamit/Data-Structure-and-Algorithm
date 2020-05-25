package greedyAlgorithms;
import java.util.Arrays;

public class CoinChangeProblem {
	static void coinChangeProblem(int [] coins, int N) {
	    
		Arrays.sort(coins);//Sort the coins in ascending order
		int index = coins.length-1;
		while(true){
		   	int coinValue = coins[index];
			index--;
			int maxAmount = (N/coinValue)*coinValue;
			if(maxAmount>0) {
	    	  System.out.println("Coin value: "+coinValue+ " taken count: "+(N/coinValue));
	    	   N = N - maxAmount;
			}
	        if(N==0)break;
		}//end of while loop
	}//end of method

}//end of class
