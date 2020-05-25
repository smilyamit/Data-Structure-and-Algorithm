package array;

public class TwoDimensionalArrayMain {

	public static void main(String[] args) {

		System.out.println("Creating a blank array of size 5X5...");
		TwoDimensionalArray sda = new TwoDimensionalArray(5,5);
		sda.traverseArray();
		
		
		sda.insertValueInTheArray(0,2,1000000001);
		sda.traverseArray();
				
		sda.insertValueInTheArray(0,2,1000000001);
		sda.traverseArray();
		
		
		sda.accessSingleCell(0,2);
		sda.accessSingleCell(6,2);
		sda.accessSingleCell(2,2);
		
		
		sda.searchingSingleValue(10);
		sda.searchingSingleValue(-2147483648);
		sda.searchingSingleValue(1000000001);
		
		
		sda.deleteValuefromArray(0,2);
		sda.traverseArray();
		
		
		sda.deleteThisArray();
		sda.traverseArray();
		
	}//end of main method	
}//end of Class
