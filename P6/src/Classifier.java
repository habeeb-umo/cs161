
public interface Classifier {
	
	/*
	 * This method creates the rule that the classifier uses to predict the label
	 * of a new data point.  In the case of the KNN classifier,  In the case of the 
	 * KNN classifier, this method has a very simple job:  all it does is store the 
	 * provided data for future use when given a new data point to classify.
	 */
	void train(LabeledDataset trainingData);
	
	/*
	 * Predict the label of example i in the dataset.  The KNN classifier will
	 * implement this using the K-nearest neighbors.
	 * This method should return the label predicted for example i in the 
	 * provided dataset
	 */
	int classify(LabeledDataset testData, int i);
	
	/*
	 * Evaluate the accuracy of the classifier on the data provided to it
	 * as input.  It computes the fraction of the example in the dataset
	 * that are classified correctly.
	 * For example, if the dataset contains 100 data points, and 80 were
	 * correctly classified, the method should return 0.8.
	 */
	float evaluate(LabeledDataset testData);
}
