import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {

	// instance variable to be populated by numbers that are divisible by seven
	private int [] divisibleBySeven;

	// BEGIN PART 1

	/**
	 * Test if x is divisible by y
	 * @param x integer 
	 * @param y integer 
	 * @return true if x is divisible by y, false otherwise
	 */
	public boolean isDivisibleBy(int x, int y)
	{
		if(x % y == 0){
			return true;
		}
		else{
			//System.out.println("isDivisibleBy NOT IMPLEMENTED");
			return false;
		}

	}
	/**
	 * Populates the instance variable divisibleBySeven with all the numbers that are 
	 * divisible by seven in the range of the numbers begin and end
	 * @param begin first integer to start the test range, inclusive
	 * @param end last integer in the test range, not inclusive, i.e. end-1
	 * is the last integer to be tested.
	 */
	public void divisorsInRange(int begin, int end)
	{
		int size = 0;
		for(int i=begin;i<end;i++){
			if(isDivisibleBy(i,7)){
				size++;
			}
		}
		divisibleBySeven = new int[size]; 
		int index = 0;
		for(int i=begin;i<end;i++){
			if(isDivisibleBy(i,7)){
				divisibleBySeven[index] = i;
				index++;
			}

		}
		//System.out.println("testDivisors NOT IMPLEMENTED");
	}


	// END PART 1

	// BEGIN PART 2

	/**
	 * Extract all positive integers from the array provided as input.  The length of
	 * the returned array should have a length that equals the number of positive
	 * elements in the input array.
	 * @param intArray array of integers
	 * @return array containing all of the positive integers from the input array
	 */

	public int[] extractPositives(int[] intArray)
	{
		int[] tempArray = null;
		for(int i=0;i<intArray.length;i++){
			if(intArray[i]>0){
				tempArray[i] = intArray[i];

			}
			return tempArray;
		}
		System.out.println("extractPositives NOT IMPLEMENTED");
		return new int[0];
	}

	// END PART 2

	// BEGIN PART 3

	/**
	 * Read in data from a file; print out the data in the specified format - 
	 * "Name: *name*, Age:*age*" 
	 *
	 * @param filename the file name containing the input data
	 */
	public void readAndPrint(String fileName)
	{
		String[] names = null;
		File file = new File(fileName);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] tokens = line.split(" ");
				System.out.println("Person: " + tokens[0] + ", " + 
				"Age: " + tokens[1] + " ");
				System.out.print(tokens[0] + ",");
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			//process the information
		}

		//System.out.println("readAndPrint NOT IMPLEMENTED");
	}

	// END PART 3

	public static void main(String[] args)
	{
		Lab1 lab = new Lab1();

		System.out.println("Test part 1");
		System.out.println("10 is divisible by 3?  " + lab.isDivisibleBy(10, 3));
		System.out.println("24 is divisible by 3?  " + lab.isDivisibleBy(24, 3));
		lab.divisorsInRange(1, 99);
		System.out.println(Arrays.toString(lab.divisibleBySeven));

		System.out.println("Test part 2");
		//Create an array of values
		//System.out.println(Arrays.toString(lab.extractPositives(values)));

		System.out.println("Test part 3");
		//Use the first command line argument as the name of the file
		lab.readAndPrint(args[0]);
	}

}
