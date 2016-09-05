import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class VectorDataset implements LabeledDataset {
	public float[][] features;
	public int[] labels;
	public int dimensions;
	
	@Override
	public int getLabel(int i) {
		
		// TODO Auto-generated method stub
		return labels[i-1];
	}

	@Override
	public float distance(int i, LabeledDataset other, int j) {
		int diff = 0;
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return features.length;
	}
	
	public float[] getFeatures(int i){
		return features[i-1];
		
	}
	
	public int getDimensionality(){
		return dimensions;
		
	}
	
	public VectorDataset(String fileName){
		//Read file for the dimensionality and the number of data
		
				//Create File object off of the file
		File input = new File(fileName);
		int dim = 0;
		int dataCount = 0;
		String s = "";
		String[] parts;
		try{
					//Create the Scanner object off of the file object
		Scanner sc = new Scanner(input);
					//Skip first line (read the first line and do nothing with it)
			sc.nextLine();
					//While the reader has next 
			while(sc.hasNext()){
						//Store the line into a string object by reading the next line
					s = sc.nextLine();
						//Update Count of examples
					dataCount++;
					//If dimensionality is empty 
					//take the line and .split("\\,") at "," storing into String[] of parts
					//Dimensionality is then line parts .length -1

				//Close the scanner object
					if(dim < 1){
						parts = s.split("\\,");
						dim = parts.length-1;
						dimensions = dim;
					}
			}
			sc.close();
//			System.out.println(dim);
//			System.out.println(dataCount);
	
			//Allocate the storage  (stored data 2D array and stored labels 1D array) 
			labels = new int[dataCount];
			features = new float[dataCount][dim];
				//Read file again, storing the data
					//Create a new scanner off the same file object from before
				Scanner dsc = new Scanner(input);
					//Skip first line
				dsc.nextLine();
					//instantiate a counter to zero
				int whileCount = 0;
					//While this second scanner has next
					while(dsc.hasNext()){
						//grab each next line and put into a string
						String s2 = dsc.nextLine();
						//Split at "," 
						parts = s2.split("\\,");
						//Label is line part[0]
						labels[whileCount] = Integer.parseInt(parts[0]);
							
						//For each dimensionality 
							for(int i = 0; i < dim; i++){
								//data[whileCounter][thisForLoopCounter] = lineParts[thisForLoopCounter+1] grabs each feature 
								features[whileCount][i] = Float.parseFloat(parts[i+1]);
							}
							//Increment while counter
							whileCount++;
							//close scanner
					}
					dsc.close();
		}
		
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
					
		 }
}
	
	public static void main(String[] args){
		VectorDataset vs = new VectorDataset("testingdata.txt");
		//System.out.println(Arrays.toString(vs.labels));
//		for(int i = 0; i< vs.features.length; i++){
//			for(int j = 0; j < vs.features[i].length; j++){
//				System.out.println(vs.features[i][j]);
//			}
//		}
		System.out.println(vs.getLabel(11));
		System.out.println(vs.size());
		System.out.println(Arrays.toString(vs.getFeatures(1)));
		System.out.println(vs.dimensions);
		
	}

}
