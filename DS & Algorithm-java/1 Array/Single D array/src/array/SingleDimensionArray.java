package array;

public class SingleDimensionArray {
	int arr[] = null;

    
    //Constructor
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];                //Above array is referenced here
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	
    // Print the array
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Array no longer exists !");
		}
	}
    
    
	//Insert value in the Array
	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Successfully inserted " + valueToBeInserted + " at location: " + location);
			} else {
				System.out.println("This cell is already occupied by another value.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
			// e.printStackTrace();
		}
	}

	
	

		
	// Access a particular element of an array
	public void accessingCell(int cellNumber) {
		try {
			System.out.println(arr[cellNumber]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");

		}
	}

	
	//Search for an element in the given Array
	public void searchInAnArray(int valueToSearch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToSearch) {
				System.out.println("Value found !");
				System.out.println("Index of " + valueToSearch + " is: " + i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found!!");
	}


	//Delete value from given Array
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		try {
			arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value as cell# provided is not in the range of array !");
			// e.printStackTrace();
		}
	}
	
	
	//Delete the entire Array
	public void deleteThisArray() {
		arr = null;
		System.out.println("Array has been succefully deleted");
	}
	
}//end of class
