
public interface LabeledDataset {
	
	// get the label associated with example i in the dataset
	public int getLabel(int i);
		
	// compute the distance between example i in the dataset and example j in 
	// the other dataset
	public float distance(int i, LabeledDataset other, int j);
		
	// the size of the dataset:  this is the number of examples represented by
	// the dataset object.
	public int size();
}
